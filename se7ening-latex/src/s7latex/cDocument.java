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

    s7latex::cDocument.java

 */
public class cDocument extends cObject {

    private cBody _body;
    private cPreamble _preamble;

    public void cDocument() {
        setBody(new cBody());
        setPreamble(new cPreamble());
        setIsContainer(true);
    }

    public void cDocument(cBody p_body, cPreamble p_preamble) {
        setBody(p_body);
        setPreamble(p_preamble);
        setIsContainer(true);
    }

    public cBody getBody() {
        return _body;
    }

    public void setBody(cBody value) {
        _body = value;
    }

    public cPreamble getPreamble() {
        return _preamble;
    }

    public void setPreamble(cPreamble value) {
        _preamble = value;
    }

    @Override public String toString() {
        return "cDocument";
    }

    @Override  public String getTEX(String ident) {
        return _preamble.getTEX(ident+"    ") + "\n" + _body.getTEX(ident+"    ");
    }

    @Override public cObject getObjectByKey(String p_key) {
        if(getKey().equals(p_key))
            return this;
        else
        {
            cObject o = getBody().getObjectByKey(p_key);
            if(o != null) return o;

            o = getPreamble().getObjectByKey(p_key);
            if(o != null) return o;
            
            return null;
        }
    }
}
