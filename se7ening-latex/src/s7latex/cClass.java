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

/*

    s7latex::cClass.java

 */
public class cClass extends cString {

    public void cClass() {
        setString("");
        setIsContainer(false);
    }

    public void cClass(String value) {
        setString(value);
        setIsContainer(false);
    }

    @Override public String toString() {
        return "cClass?";
    }

    @Override public String getTEX(String ident) {
        return ident + getString();
    }

    @Override public cObject getObjectByKey(String p_key) {
        if(getKey().equals(p_key))
            return this;
        else
            return null;
    }

}
