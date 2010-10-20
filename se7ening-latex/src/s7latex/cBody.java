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

import java.util.List;
import java.util.ArrayList;

/*

    s7latex::cBody.java

 */
public class cBody {

    private boolean _showtitle = false;
    private List<cObject> _objects;

    public void cBody(boolean p_showtitle, cObject p_afirstobject) {
        _objects = new ArrayList<cObject>();
        _objects.add(p_afirstobject);
    }

    public boolean getShowTitle() {
        return _showtitle;
    }

    public void addObject(cObject value) {
        _objects.add(value);
    }

    public List<cObject> getObjects() {
        return _objects;
    }

    public void setObjects(List<cObject> value) {
        _objects = value;
    }

    public void setShowTitle(boolean value) {
        _showtitle = value;
    }

    @Override public String toString() {
        return "";
    }

    public String getTEX(String ident) {

        String s = "";

        for (cObject o : getObjects()) {
            s += o.getTEX(ident + "    ") + "\n";
        }

        return s;
    }
}