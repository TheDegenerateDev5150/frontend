/**
 * DO NOT EDIT THIS FILE
 *
 * It is not used to to build anything.
 *
 * It's just a record of the old flow types.
 *
 * Use it as a guide when converting
 * - static/src/javascripts/projects/common/modules/identity/upsell/checkbox/Checkbox.js
 * to .ts, then delete it.
 */

// @flow
import React from 'preact-compat';

type CheckboxHtmlProps = {
    checked: ?boolean,
    onChange: (ev: Event) => void,
};

type CheckboxProps = {
    title: string,
    uniqueId: string,
    checkboxHtmlProps: CheckboxHtmlProps,
};

const Checkbox = ({ title, uniqueId, checkboxHtmlProps }: CheckboxProps) => (
    <label
        data-link-name={`upsell-consent : checkbox : ${uniqueId} : ${
            checkboxHtmlProps.checked ? 'untick' : 'tick'
        }`}
        className="identity-upsell-checkbox"
        htmlFor={uniqueId}>
        <span className="identity-upsell-checkbox__title">{title}</span>
        <input type="checkbox" id={uniqueId} {...checkboxHtmlProps} />
        <span className="identity-upsell-checkbox__checkmark">
            <span className="identity-upsell-checkbox__checkmark_tick" />
        </span>
    </label>
);

export { Checkbox };