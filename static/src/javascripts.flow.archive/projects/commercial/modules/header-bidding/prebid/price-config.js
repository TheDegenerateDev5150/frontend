/**
 * DO NOT EDIT THIS FILE
 *
 * It is not used to to build anything.
 *
 * It's just a record of the old flow types.
 *
 * Use it as a guide when converting
 * - static/src/javascripts/projects/commercial/modules/header-bidding/prebid/price-config.js
 * to .ts, then delete it.
 */

// @flow strict

type PrebidPriceGranularity = {
    buckets: Array<{
        precision?: number,
        max: number,
        increment: number,
    }>,
};

export type { PrebidPriceGranularity };

export const priceGranularity: PrebidPriceGranularity = {
    buckets: [
        {
            max: 100,
            increment: 0.01,
        },
        {
            max: 500,
            increment: 1,
        },
    ],
};