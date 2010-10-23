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

    s7latex::cDocumentClass.java

 */
public class cDocumentClass {

    private cClass _class;
    private List<cOption> _options;

    cDocumentClass() {
        _options = new ArrayList<cOption>();
    }

    cDocumentClass(cOption p_afirstoption) {
        _options = new ArrayList<cOption>();
        _options.add(p_afirstoption);
    }

    public void addOption(cOption value) {
        _options.add(value);
    }

    public List<cOption> getOptions() {
        return _options;
    }

    public void setClass(cClass value) {
        _class = value;
    }

    public cClass getClass_() {
        return _class;
    }

    public void setOptions(List<cOption> value) {
        _options = value;
    }

    @Override public String toString() {
        return "cDocumentClass?";
    }

    public String getTEX(String ident) {

         String s = ident + "\\documentclass";

        if(_options.size() > 0) {
            s += "[";

            boolean first = true;

            for(cOption o : _options) {
                if(!first) s += ",";
                s += o.getTEX("");
                first = false;
            }

            s += "]";
            s += "{" + getClass_() + "}";
        }

        return s;

    }

}
