/**
 * DO NOT EDIT THIS FILE
 *
 * It is not used to to build anything.
 *
 * It's just a record of the old flow types.
 *
 * Use it as a guide when converting
 * - static/src/javascripts/projects/facia/modules/ui/container-show-more.spec.js
 * to .ts, then delete it.
 */

// @flow

import bonzo from 'bonzo';
import qwery from 'qwery';

import { _ } from 'facia/modules/ui/container-show-more';

jest.mock('lib/raven');

const { itemsByArticleId, dedupShowMore } = _;

describe('Container Show More', () => {
    let $container;

    const itemWithId = id => `<div class="js-fc-item" data-id="${id}"></div>`;

    beforeEach(() => {
        $container = bonzo(
            bonzo.create(
                `<div>${itemWithId('loldongs')}${itemWithId(
                    'corgi'
                )}${itemWithId('geekpie')}</div>`
            )
        );
    });

    afterEach(() => {
        $container.remove();
    });

    it('should be able to group elements by id', () => {
        const grouped = itemsByArticleId($container);
        expect(
            Object.keys(grouped).filter(i =>
                new Set(['loldongs', 'corgi', 'geekpie']).has(i)
            ).length === 3
        ).toBeTruthy();
    });

    it('should de-duplicate items loaded in', () => {
        const $after = dedupShowMore(
            $container,
            `<div>${itemWithId('corgi')}${itemWithId('daschund')}</div>`
        );

        expect(qwery('.js-fc-item', $after).length === 1).toBeTruthy();
    });
});