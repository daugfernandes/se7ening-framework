/*
 *
 *     Copyright (C) 2010  David Fernandes
 *
 *                         Rua da Quinta Amarela, 60
 *                         4475-663 MAIA
 *                         PORTUGAL
 *
 *                         <daugfernandes@aim.com>
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package s7latex;

/**
    General purpose string. For a command not implemented or whatever.
 **/
public class cString extends cObject {

    /**
     * Private content.
     */
    private String _string;

    /**
     * Default parameterless constructor.
     */
    public void cString() {
        setString("");
    }

    /**
     * Copy constructor.
     * @param value cString to copy from.
     */
    public void cString(cString value) {
        setString(value.getString());
    }

    /**
     * String constructor.
     * @param value String value to store.
     */
    public void cString(String value) {
        setString(value);
    }

    /**
     * String Getter
     * @return String stored.
     */
    public String getString() {
        return _string;
    }

    /**
     * String Setter.
     * @param value Valur to set the String to.
     */
    public void setString(String value) {
        _string = value;
    }

    /**
     * ToString override.
     * @return General information about the class and its content.
     */
    @Override public String toString() {
        return "cString:" + getString();
    }

    /**
     * Get TEX representation of the String.
     * @param ident Indentation string; normaly some white spaces or come tab characters.
     * @return Tex string.
     */
    @Override public String getTEX(String ident) {
        return ident + getString();
    }

}
