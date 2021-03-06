/**
 * This file is part of SynchronizeFX.
 * 
 * Copyright (C) 2013-2014 Saxonia Systems AG
 *
 * SynchronizeFX is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SynchronizeFX is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with SynchronizeFX. If not, see <http://www.gnu.org/licenses/>.
 */

package de.saxsys.synchronizefx.testapp;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Represents a message with a simple text.
 * 
 * @author ragna-diana.steglich
 * 
 */
public class Message {

    private StringProperty text = new SimpleStringProperty();

    /**
     * @return the text of a message
     */
    public String getText() {
        return text.get();
    }

    /**
     * Initializes the text of the message with the specified parameter.
     * 
     * @param text
     *            the new text of the message
     */
    public void setText(final String text) {
        this.text.set(text);
    }

    /**
     * @see Message#getText()
     * @return the property
     */
    public StringProperty textProperty() {
        return text;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((text.get() == null) ? 0 : text.get().hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Message other = (Message) obj;
        if (text.get() == null) {
            if (other.text.get() != null) {
                return false;
            }
        } else if (!text.get().equals(other.text.get())) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Message [text=" + text.get() + "]";
    }
}
