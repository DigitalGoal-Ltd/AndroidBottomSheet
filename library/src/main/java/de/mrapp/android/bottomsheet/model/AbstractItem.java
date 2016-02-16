/*
 * AndroidBottomSheet Copyright 2016 Michael Rapp
 *
 * This program is free software: you can redistribute it and/or modify it under the terms of the
 * GNU Lesser General Public License as published by the Free Software Foundation, either version 3
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this program.
 * If not, see <http://www.gnu.org/licenses/>.
 */
package de.mrapp.android.bottomsheet.model;

import android.support.annotation.CallSuper;

import java.io.Serializable;

/**
 * An abstract base class for all items, which can be shown in a bottom sheet.
 *
 * @author Michael Rapp
 * @since 1.0.0
 */
public abstract class AbstractItem implements Serializable, Cloneable {

    /**
     * The constant serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * The item's title.
     */
    private CharSequence title;

    /**
     * Creates a new item.
     *
     * @param title
     *         The item's title as an instance of the type {@link CharSequence} or null, if no title
     *         should be set
     */
    public AbstractItem(final CharSequence title) {
        this.title = title;
    }

    /**
     * Returns the item's title.
     *
     * @return The items's title as an instance of the type {@link CharSequence} or null, if no
     * title has been set
     */
    public final CharSequence getTitle() {
        return title;
    }

    /**
     * Sets the item's title.
     *
     * @param title
     *         The title, which should be set, as an instance of the type {@link CharSequence} or
     *         null, of no title should be set
     */
    @CallSuper
    public void setTitle(final CharSequence title) {
        this.title = title;
    }

    @CallSuper
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        return result;
    }

    @CallSuper
    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AbstractItem other = (AbstractItem) obj;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        return true;
    }

}