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

    s7latex::cUtil.java

 */
abstract public class cUtil {

    enum greeks {
        Gamma,Delta,Theta,Lambda,Xi,Pi,Sigma,Upsilon,Phi,Psi,Omega,alpha,
        beta,gamma,delta,epsilon,varepsilon,zeta,eta,theta,vartheta,iota,kappa,
        lambda,mu,nu,xi,o,pi,varpi,rho,varrho,sigma,varsigma,tau,upsilon,phi,
        varphi,chi,psi,omega
    }

    enum relationals {
        greater,less,le,ge,ll,gg,prec,succ,preceq,succeq,subset,supset,subseteq,
        supseteq,sqsubseteq,sqsupseteq,in,ni,notin,vdash,dashv,mid,parallel,perp,
        smile,frown,asymp,equal,equiv,doteq,sim,simeq,approx,cong,bowtie,models,
        propto,neq
    }

    enum binaryop {
        pm,mp,times,div,cdot,ast,star,amalg,cap,cup,uplus,sqcap,sqcup,vee,wedge,
        oplus,ominus,otimes,oslash,odot,circ,bullet,diamond,bigcirc,bigtriangledown,
        bigtriangleup,triangleleft,triangleright,wr,sum,prod,copord,int_,oint,
        bigcap,bigcup,biguplus,bigsqcup,bigvee,bigwedge,bigoplus,bigotimes,bigodot
    }

    enum arrows {
        leftarrow,gets,rightarrow,longleftarrow,longrightarrow,leftrightarrow,
        longleftrightarrow,Leftarrow,Longleftarrow,Leftrightarrow,mapsto,
        longmapsto,hookrightarrow,hookleftarrow,leftharpoondown,leftharpoonup,
        rightharpoondown,rightharpoonup,rightleftharpoons,uparrow,downarrow,
        updownarrow,Uparrow,Downarrow,Updownarrow,nearrow,nwarrow,searrow,swarrow
    }

    enum delimiters {
        lfloor,rfloor,lceil,rceil,langle,rangle,vert,Vert
    }


    cUtil() {

    }

    static String Translate(greeks g) {

        if(g==greeks.Delta)
            return "\\Delta";
        else if(g==greeks.Gamma)
            return "\\Gamma";
        else if(g==greeks.Lambda)
            return "\\Lambda";
        else if(g==greeks.Omega)
            return "\\Omega";
        else if(g==greeks.Phi)
            return "\\Phi";
        else if(g==greeks.Pi)
            return "\\Pi";
        else if(g==greeks.Psi)
            return "\\Psi";
        else if(g==greeks.Sigma)
            return "\\Sigma";


        return "";
    }

    static String Translate(relationals r) {

        return "";
    }

    static String Translate(String s) {
        
           s = s.replace("ã", "\\~{a}");
           s = s.replace("õ", "\\~{o}");
           s = s.replace("ñ", "\\~{n}");

           s = s.replace("â", "\\^{a}");
           s = s.replace("ê", "\\^{e}");
           s = s.replace("î", "\\^{i}");
           s = s.replace("ô", "\\^{o}");
           s = s.replace("û", "\\^{u}");

           s = s.replace("á", "\\'{a}");
           s = s.replace("é", "\\'{e}");
           s = s.replace("í", "\\'{i}");
           s = s.replace("ó", "\\'{o}");
           s = s.replace("ú", "\\'{u}");

           s = s.replace("à", "\\`{a}");
           s = s.replace("è", "\\`{e}");
           s = s.replace("ì", "\\`{i}");
           s = s.replace("ò", "\\`{o}");
           s = s.replace("ù", "\\`{u}");

           s = s.replace("ä", "\\\"\"{a}");
           s = s.replace("ë", "\\\"\"{e}");
           s = s.replace("ï", "\\\"\"{i}");
           s = s.replace("ö", "\\\"\"{o}");
           s = s.replace("ü", "\\\"\"{u}");

           s = s.replace("ã", "\\~{a}");
           s = s.replace("õ", "\\~{o}");
           s = s.replace("ñ", "\\~{n}");

           s = s.replace("Â", "\\^{A}");
           s = s.replace("Ê", "\\^{E}");
           s = s.replace("Î", "\\^{I}");
           s = s.replace("Ô", "\\^{O}");
           s = s.replace("Û", "\\^{U}");
           
           s = s.replace("Á", "\\'{A}");
           s = s.replace("É", "\\'{E}");
           s = s.replace("Í", "\\'{I}");
           s = s.replace("Ó", "\\'{O}");
           s = s.replace("Ú", "\\'{U}");

           s = s.replace("À", "\\`{A}");
           s = s.replace("È", "\\`{E}");
           s = s.replace("Ì", "\\`{I}");
           s = s.replace("Ò", "\\`{O}");
           s = s.replace("Ù", "\\`{U}");

           s = s.replace("Ä", "\\\"\"{A}");
           s = s.replace("Ë", "\\\"\"{E}");
           s = s.replace("Ï", "\\\"\"{I}");
           s = s.replace("Ö", "\\\"\"{O}");
           s = s.replace("Ü", "\\\"\"{U}");

           s = s.replace("$", "\\{$}");
           s = s.replace("%", "\\{%}");
           s = s.replace("_", "\\{_}");
           s = s.replace("}", "\\{}}");
           s = s.replace("{", "\\{{}");
           s = s.replace("&", "\\{&}");
           s = s.replace("#", "\\{#}");

           s = s.replace(">", "\\textgreater ");
           s = s.replace("<", "\\textless ");
           s = s.replace("*", "\\textasterisccentered ");
           s = s.replace("\\", "\\textbackslash ");
           s = s.replace("|", "\\textbar ");
           s = s.replace("ª", "\\textordfeminine ");
           s = s.replace("º", "\\textordmasculine ");
           s = s.replace(".", "\\textperiodcentered ");

           s = s.replace("<", "\\");
           s = s.replace("<", "\\");
           s = s.replace("<", "\\");
           s = s.replace("<", "\\");
           s = s.replace("<", "\\");
           s = s.replace("<", "\\");
           s = s.replace("<", "\\");
           s = s.replace("<", "\\");
           s = s.replace("<", "\\");
           s = s.replace("<", "\\");

           s = s.replace("^", "\\^{}");
           s = s.replace("~", "\\~{}");

           return s;
    }

}
