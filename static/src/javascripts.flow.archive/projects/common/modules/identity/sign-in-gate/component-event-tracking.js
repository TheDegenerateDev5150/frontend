/**
 * DO NOT EDIT THIS FILE
 *
 * It is not used to to build anything.
 *
 * It's just a record of the old flow types.
 *
 * Use it as a guide when converting
 * - static/src/javascripts/projects/common/modules/identity/sign-in-gate/component-event-tracking.js
 * to .ts, then delete it.
 */

// @flow
import ophan from 'ophan/ng';

type ABTestVariant = {
    name: string,
    variant: string,
};

type ComponentEventWithoutAction = {
    component: OphanComponent,
    value?: string,
    id?: string,
    abTest?: ABTestVariant,
};

// ophan helper methods
export const submitComponentEventTracking = (
    componentEvent: OphanComponentEvent
) => {
    ophan.record({ componentEvent });
};

export const submitViewEventTracking = (
    componentEvent: ComponentEventWithoutAction
) =>
    submitComponentEventTracking({
        ...componentEvent,
        action: 'VIEW',
    });

export const submitClickEventTracking = (
    componentEvent: ComponentEventWithoutAction
) =>
    submitComponentEventTracking({
        ...componentEvent,
        action: 'CLICK',
    });