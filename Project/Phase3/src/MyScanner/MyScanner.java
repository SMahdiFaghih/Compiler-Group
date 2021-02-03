package MyScanner;

import java_cup.runtime.*;
import java.io.*;
import parser.*;

// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class MyScanner implements Scanner
{

    /**
     * This character denotes the end of file.
     */
    public static final int YYEOF = -1;

    /**
     * Initial size of the lookahead buffer.
     */
    private static final int ZZ_BUFFERSIZE = 16384;

    // Lexical states.
    public static final int YYINITIAL = 0;

    /**
     * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
     * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
     * at the beginning of a line
     * l is of the form l = 2*k, k a non negative integer
     */
    private static final int ZZ_LEXSTATE[] = {0, 0};

    /**
     * Top-level table for translating characters to character classes
     */
    private static final int[] ZZ_CMAP_TOP = zzUnpackcmap_top();

    private static final String ZZ_CMAP_TOP_PACKED_0 = "\1\0\25\u0100\1\u0200\11\u0100\1\u0300\17\u0100\1\u0400\u10cf\u0100";

    private static int[] zzUnpackcmap_top()
    {
        int[] result = new int[4352];
        int offset = 0;
        offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackcmap_top(String packed, int offset, int[] result)
    {
        int i = 0;       /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l)
        {
            int count = packed.charAt(i++);
            int value = packed.charAt(i++);
            do
                result[j++] = value; while (--count > 0);
        }
        return j;
    }


    /**
     * Second-level tables for translating characters to character classes
     */
    private static final int[] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

    private static final String ZZ_CMAP_BLOCKS_PACKED_0 = "\11\0\1\1\1\2\3\1\22\0\1\1\1\3\1\4" + "\2\0\1\5\1\6\1\0\1\7\1\10\1\11\1\12" + "\1\13\1\14\1\15\1\16\1\17\11\20\1\0\1\21" + "\1\22\1\23\1\24\2\0\1\25\3\26\1\27\1\26" + "\2\30\1\31\2\30\1\32\1\30\1\33\1\30\1\34" + "\1\30\1\35\5\30\1\36\2\30\1\37\1\0\1\40" + "\1\0\1\41\1\0\1\42\1\43\1\44\1\45\1\46" + "\1\47\1\50\1\51\1\52\1\30\1\53\1\54\1\55" + "\1\56\1\57\1\60\1\30\1\61\1\62\1\63\1\64" + "\1\65\1\66\1\67\1\70\1\30\1\71\1\72\1\73" + "\7\0\1\1\32\0\1\1\u01df\0\1\1\177\0\13\1" + "\35\0\2\1\5\0\1\1\57\0\1\1\240\0\1\1" + "\377\0";

    private static int[] zzUnpackcmap_blocks()
    {
        int[] result = new int[1280];
        int offset = 0;
        offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackcmap_blocks(String packed, int offset, int[] result)
    {
        int i = 0;       /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l)
        {
            int count = packed.charAt(i++);
            int value = packed.charAt(i++);
            do
                result[j++] = value; while (--count > 0);
        }
        return j;
    }

    /**
     * Translates DFA states to action switch labels.
     */
    private static final int[] ZZ_ACTION = zzUnpackAction();

    private static final String ZZ_ACTION_PACKED_0 = "\1\0\1\1\1\2\1\0\1\3\1\0\1\4\1\5" + "\1\6\1\7\1\10\1\11\1\12\1\13\2\14\1\15" + "\1\16\1\17\1\20\4\21\1\22\1\23\15\21\1\24" + "\1\0\1\25\1\26\1\0\1\27\1\0\1\30\1\31" + "\1\0\1\32\1\33\1\34\16\21\1\35\15\21\1\36" + "\1\37\2\0\1\40\15\21\1\41\1\21\1\42\1\21" + "\1\43\12\21\1\30\1\0\1\44\1\31\3\21\1\45" + "\1\21\1\46\3\21\1\47\1\50\3\21\1\51\1\52" + "\1\53\5\21\1\54\1\55\1\56\2\21\1\57\2\21" + "\1\60\1\61\12\21\1\62\4\21\1\63\5\21\1\64" + "\1\65\1\66\4\21\1\67\2\21\1\70\1\21\1\71" + "\1\21\1\72\1\73\5\21\1\74\1\75\1\21\1\76" + "\1\77";

    private static int[] zzUnpackAction()
    {
        int[] result = new int[196];
        int offset = 0;
        offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackAction(String packed, int offset, int[] result)
    {
        int i = 0;       /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l)
        {
            int count = packed.charAt(i++);
            int value = packed.charAt(i++);
            do
                result[j++] = value; while (--count > 0);
        }
        return j;
    }


    /**
     * Translates a state to a row index in the transition table
     */
    private static final int[] ZZ_ROWMAP = zzUnpackRowMap();

    private static final String ZZ_ROWMAP_PACKED_0 = "\0\0\0\74\0\170\0\264\0\74\0\360\0\74\0\74" + "\0\74\0\74\0\74\0\74\0\74\0\u012c\0\u0168\0\u01a4" + "\0\74\0\u01e0\0\u021c\0\u0258\0\u0294\0\u02d0\0\u030c\0\u0348" + "\0\74\0\74\0\u0384\0\u03c0\0\u03fc\0\u0438\0\u0474\0\u04b0" + "\0\u04ec\0\u0528\0\u0564\0\u05a0\0\u05dc\0\u0618\0\u0654\0\74" + "\0\u0690\0\74\0\74\0\u06cc\0\74\0\u0708\0\u0744\0\u0780" + "\0\u07bc\0\74\0\74\0\74\0\u07f8\0\u0834\0\u0870\0\u08ac" + "\0\u08e8\0\u0924\0\u0960\0\u099c\0\u09d8\0\u0a14\0\u0a50\0\u0a8c" + "\0\u0ac8\0\u0b04\0\u0294\0\u0b40\0\u0b7c\0\u0bb8\0\u0bf4\0\u0c30" + "\0\u0c6c\0\u0ca8\0\u0ce4\0\u0d20\0\u0d5c\0\u0d98\0\u0dd4\0\u0e10" + "\0\74\0\74\0\u0e4c\0\u0e88\0\u0ec4\0\u0f00\0\u0f3c\0\u0f78" + "\0\u0fb4\0\u0ff0\0\u102c\0\u1068\0\u10a4\0\u10e0\0\u111c\0\u1158" + "\0\u1194\0\u11d0\0\u0294\0\u120c\0\u1248\0\u1284\0\u0294\0\u12c0" + "\0\u12fc\0\u1338\0\u1374\0\u13b0\0\u13ec\0\u1428\0\u1464\0\u14a0" + "\0\u14dc\0\u0708\0\u1518\0\u1518\0\u1554\0\u1590\0\u15cc\0\u1608" + "\0\u0294\0\u1644\0\u0294\0\u1680\0\u16bc\0\u16f8\0\u0294\0\u0294" + "\0\u1734\0\u1770\0\u17ac\0\u0294\0\u0294\0\u0294\0\u17e8\0\u1824" + "\0\u1860\0\u189c\0\u18d8\0\u0294\0\u0294\0\u0294\0\u1914\0\u1950" + "\0\u0294\0\u198c\0\u19c8\0\u0294\0\u0294\0\u1a04\0\u1a40\0\u1a7c" + "\0\u1ab8\0\u1af4\0\u1b30\0\u1b6c\0\u1ba8\0\u1be4\0\u1c20\0\u0294" + "\0\u1c5c\0\u1c98\0\u1cd4\0\u1d10\0\u0294\0\u1d4c\0\u1d88\0\u1dc4" + "\0\u1e00\0\u1e3c\0\u0294\0\u0294\0\u0294\0\u1e78\0\u1eb4\0\u1ef0" + "\0\u1f2c\0\u0294\0\u1f68\0\u1fa4\0\u0294\0\u1fe0\0\u0294\0\u201c" + "\0\u0294\0\u0294\0\u2058\0\u2094\0\u20d0\0\u210c\0\u2148\0\u0294" + "\0\u0294\0\u2184\0\u0294\0\u0294";

    private static int[] zzUnpackRowMap()
    {
        int[] result = new int[196];
        int offset = 0;
        offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackRowMap(String packed, int offset, int[] result)
    {
        int i = 0;  /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l)
        {
            int high = packed.charAt(i++) << 16;
            result[j++] = high | packed.charAt(i++);
        }
        return j;
    }

    /**
     * The transition table of the DFA
     */
    private static final int[] ZZ_TRANS = zzUnpackTrans();

    private static final String ZZ_TRANS_PACKED_0 = "\1\0\2\2\1\3\1\4\1\5\1\6\1\7\1\10" + "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20" + "\1\21\1\22\1\23\1\24\6\25\1\26\1\27\1\30" + "\1\25\1\31\1\32\1\0\1\25\1\33\1\34\1\35" + "\1\36\1\37\2\25\1\40\3\25\1\41\1\25\1\42" + "\1\43\1\44\1\45\1\25\1\46\1\47\2\25\1\50" + "\1\51\1\52\117\0\1\53\50\0\2\54\1\0\1\54" + "\1\0\67\54\6\0\1\55\76\0\1\56\4\0\1\57" + "\72\0\1\60\1\0\2\20\15\0\1\61\30\0\1\61" + "\21\0\1\60\1\0\2\20\76\0\1\62\73\0\1\63" + "\73\0\1\64\67\0\2\25\4\0\12\25\2\0\30\25" + "\22\0\2\25\4\0\12\25\2\0\5\25\1\65\22\25" + "\22\0\2\25\4\0\12\25\2\0\20\25\1\66\7\25" + "\22\0\2\25\4\0\12\25\2\0\5\25\1\67\22\25" + "\22\0\2\25\4\0\12\25\2\0\16\25\1\70\1\25" + "\1\71\1\25\1\72\5\25\22\0\2\25\4\0\12\25" + "\2\0\13\25\1\73\2\25\1\74\11\25\22\0\2\25" + "\4\0\12\25\2\0\16\25\1\75\3\25\1\76\5\25" + "\22\0\2\25\4\0\12\25\2\0\13\25\1\77\12\25" + "\1\100\1\25\22\0\2\25\4\0\12\25\2\0\1\25" + "\1\101\14\25\1\102\11\25\22\0\2\25\4\0\12\25" + "\2\0\6\25\1\103\5\25\1\104\1\105\4\25\1\106" + "\5\25\22\0\2\25\4\0\12\25\2\0\5\25\1\107" + "\15\25\1\110\4\25\22\0\2\25\4\0\12\25\2\0" + "\20\25\1\111\2\25\1\112\4\25\22\0\2\25\4\0" + "\12\25\2\0\5\25\1\113\22\25\22\0\2\25\4\0" + "\12\25\2\0\22\25\1\114\5\25\22\0\2\25\4\0" + "\12\25\2\0\10\25\1\115\7\25\1\116\7\25\22\0" + "\2\25\4\0\12\25\2\0\16\25\1\117\11\25\22\0" + "\2\25\4\0\12\25\2\0\10\25\1\120\17\25\75\0" + "\1\121\1\0\2\54\1\0\1\54\1\122\67\54\11\56" + "\1\123\62\56\2\57\1\0\71\57\17\0\2\60\6\0" + "\1\124\16\0\1\124\44\0\2\125\4\0\3\125\12\0" + "\6\125\43\0\2\25\4\0\12\25\2\0\25\25\1\126" + "\2\25\22\0\2\25\4\0\12\25\2\0\11\25\1\127" + "\16\25\22\0\2\25\4\0\12\25\2\0\1\25\1\130" + "\26\25\22\0\2\25\4\0\12\25\2\0\16\25\1\131" + "\11\25\22\0\2\25\4\0\12\25\2\0\5\25\1\132" + "\22\25\22\0\2\25\4\0\12\25\2\0\16\25\1\133" + "\11\25\22\0\2\25\4\0\12\25\2\0\1\25\1\134" + "\26\25\22\0\2\25\4\0\12\25\2\0\15\25\1\135" + "\12\25\22\0\2\25\4\0\12\25\2\0\23\25\1\136" + "\4\25\22\0\2\25\4\0\12\25\2\0\16\25\1\137" + "\11\25\22\0\2\25\4\0\12\25\2\0\21\25\1\140" + "\6\25\22\0\2\25\4\0\12\25\2\0\22\25\1\141" + "\5\25\22\0\2\25\4\0\12\25\2\0\13\25\1\142" + "\14\25\22\0\2\25\4\0\12\25\2\0\20\25\1\143" + "\7\25\22\0\2\25\4\0\12\25\2\0\17\25\1\144" + "\10\25\22\0\2\25\4\0\12\25\2\0\22\25\1\145" + "\5\25\22\0\2\25\4\0\12\25\2\0\16\25\1\146" + "\11\25\22\0\2\25\4\0\12\25\2\0\25\25\1\147" + "\2\25\22\0\2\25\4\0\12\25\2\0\13\25\1\150" + "\14\25\22\0\2\25\4\0\12\25\2\0\11\25\1\151" + "\4\25\1\152\11\25\22\0\2\25\4\0\12\25\2\0" + "\2\25\1\153\25\25\22\0\2\25\4\0\12\25\2\0" + "\22\25\1\154\5\25\22\0\2\25\4\0\12\25\2\0" + "\20\25\1\155\7\25\22\0\2\25\4\0\12\25\2\0" + "\11\25\1\156\16\25\22\0\2\25\4\0\12\25\2\0" + "\23\25\1\157\4\25\22\0\2\25\4\0\12\25\2\0" + "\11\25\1\160\16\25\22\0\2\25\4\0\12\25\2\0" + "\11\25\1\161\16\25\3\0\11\56\1\123\4\56\1\162" + "\55\56\12\0\1\163\1\0\1\163\2\0\2\164\70\0" + "\1\165\1\0\2\125\4\0\3\125\12\0\6\125\43\0" + "\2\25\4\0\1\166\11\25\2\0\30\25\22\0\2\25" + "\4\0\12\25\2\0\15\25\1\167\12\25\22\0\2\25" + "\4\0\12\25\2\0\4\25\1\170\23\25\22\0\2\25" + "\4\0\12\25\2\0\13\25\1\171\14\25\22\0\2\25" + "\4\0\12\25\2\0\1\25\1\172\26\25\22\0\2\25" + "\4\0\12\25\2\0\11\25\1\173\16\25\22\0\2\25" + "\4\0\12\25\2\0\21\25\1\174\6\25\22\0\2\25" + "\4\0\12\25\2\0\22\25\1\175\5\25\22\0\2\25" + "\4\0\12\25\2\0\2\25\1\176\25\25\22\0\2\25" + "\4\0\12\25\2\0\11\25\1\177\16\25\22\0\2\25" + "\4\0\12\25\2\0\5\25\1\200\22\25\22\0\2\25" + "\4\0\12\25\2\0\5\25\1\201\22\25\22\0\2\25" + "\4\0\12\25\2\0\21\25\1\157\6\25\22\0\2\25" + "\4\0\12\25\2\0\13\25\1\202\14\25\22\0\2\25" + "\4\0\12\25\2\0\5\25\1\203\22\25\22\0\2\25" + "\4\0\12\25\2\0\2\25\1\204\1\25\1\205\23\25" + "\22\0\2\25\4\0\12\25\2\0\13\25\1\206\14\25" + "\22\0\2\25\4\0\12\25\2\0\24\25\1\207\3\25" + "\22\0\2\25\4\0\12\25\2\0\22\25\1\210\5\25" + "\22\0\2\25\4\0\12\25\2\0\13\25\1\211\14\25" + "\22\0\2\25\4\0\12\25\2\0\23\25\1\212\4\25" + "\22\0\2\25\4\0\12\25\2\0\11\25\1\213\16\25" + "\22\0\2\25\4\0\12\25\2\0\21\25\1\214\6\25" + "\22\0\2\25\4\0\12\25\2\0\5\25\1\215\22\25" + "\22\0\2\25\4\0\12\25\2\0\4\25\1\216\23\25" + "\22\0\2\25\4\0\12\25\2\0\13\25\1\217\14\25" + "\22\0\2\164\72\0\2\165\4\0\3\165\12\0\6\165" + "\43\0\2\25\4\0\12\25\2\0\20\25\1\220\7\25" + "\22\0\2\25\4\0\12\25\2\0\22\25\1\221\5\25" + "\22\0\2\25\4\0\4\25\1\222\1\223\4\25\2\0" + "\30\25\22\0\2\25\4\0\12\25\2\0\12\25\1\224" + "\15\25\22\0\2\25\4\0\12\25\2\0\21\25\1\225" + "\6\25\22\0\2\25\4\0\12\25\2\0\11\25\1\226" + "\16\25\22\0\2\25\4\0\12\25\2\0\13\25\1\227" + "\14\25\22\0\2\25\4\0\12\25\2\0\15\25\1\230" + "\12\25\22\0\2\25\4\0\12\25\2\0\5\25\1\231" + "\22\25\22\0\2\25\4\0\12\25\2\0\20\25\1\232" + "\7\25\22\0\2\25\4\0\12\25\2\0\1\25\1\233" + "\26\25\22\0\2\25\4\0\12\25\2\0\5\25\1\234" + "\22\25\22\0\2\25\4\0\12\25\2\0\11\25\1\235" + "\16\25\22\0\2\25\4\0\12\25\2\0\20\25\1\236" + "\7\25\22\0\2\25\4\0\12\25\2\0\15\25\1\237" + "\12\25\22\0\2\25\4\0\12\25\2\0\5\25\1\240" + "\22\25\22\0\2\25\4\0\12\25\2\0\20\25\1\241" + "\7\25\22\0\2\25\4\0\12\25\2\0\15\25\1\242" + "\12\25\22\0\2\25\4\0\12\25\2\0\11\25\1\243" + "\16\25\22\0\2\25\4\0\12\25\2\0\15\25\1\244" + "\12\25\22\0\2\25\4\0\12\25\2\0\5\25\1\245" + "\22\25\22\0\2\25\4\0\12\25\2\0\4\25\1\246" + "\23\25\22\0\2\25\4\0\12\25\2\0\14\25\1\247" + "\13\25\22\0\2\25\4\0\12\25\2\0\6\25\1\250" + "\21\25\22\0\2\25\4\0\12\25\2\0\22\25\1\251" + "\5\25\22\0\2\25\4\0\12\25\2\0\3\25\1\252" + "\24\25\22\0\2\25\4\0\12\25\2\0\3\25\1\253" + "\24\25\22\0\2\25\4\0\12\25\2\0\15\25\1\254" + "\12\25\22\0\2\25\4\0\12\25\2\0\7\25\1\255" + "\20\25\22\0\2\25\4\0\12\25\2\0\1\25\1\256" + "\26\25\22\0\2\25\4\0\12\25\2\0\22\25\1\257" + "\5\25\22\0\2\25\4\0\12\25\2\0\15\25\1\260" + "\12\25\22\0\2\25\4\0\12\25\2\0\23\25\1\261" + "\4\25\22\0\2\25\4\0\12\25\2\0\21\25\1\262" + "\6\25\22\0\2\25\4\0\12\25\2\0\5\25\1\263" + "\22\25\22\0\2\25\4\0\12\25\2\0\1\25\1\264" + "\26\25\22\0\2\25\4\0\12\25\2\0\5\25\1\265" + "\22\25\22\0\2\25\4\0\12\25\2\0\22\25\1\266" + "\5\25\22\0\2\25\4\0\12\25\2\0\27\25\1\267" + "\22\0\2\25\4\0\12\25\2\0\5\25\1\270\22\25" + "\22\0\2\25\4\0\12\25\2\0\5\25\1\271\22\25" + "\22\0\2\25\4\0\12\25\2\0\5\25\1\272\22\25" + "\22\0\2\25\4\0\12\25\2\0\15\25\1\273\12\25" + "\22\0\2\25\4\0\12\25\2\0\3\25\1\274\24\25" + "\22\0\2\25\4\0\12\25\2\0\5\25\1\275\22\25" + "\22\0\2\25\4\0\12\25\2\0\7\25\1\276\20\25" + "\22\0\2\25\4\0\12\25\2\0\22\25\1\277\5\25" + "\22\0\2\25\4\0\12\25\2\0\5\25\1\300\22\25" + "\22\0\2\25\4\0\12\25\2\0\4\25\1\301\23\25" + "\22\0\2\25\4\0\12\25\2\0\5\25\1\302\22\25" + "\22\0\2\25\4\0\12\25\2\0\21\25\1\303\6\25" + "\22\0\2\25\4\0\12\25\2\0\20\25\1\304\7\25" + "\3\0";

    private static int[] zzUnpackTrans()
    {
        int[] result = new int[8640];
        int offset = 0;
        offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackTrans(String packed, int offset, int[] result)
    {
        int i = 0;       /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l)
        {
            int count = packed.charAt(i++);
            int value = packed.charAt(i++);
            value--;
            do
                result[j++] = value; while (--count > 0);
        }
        return j;
    }


    /**
     * Error code for "Unknown internal scanner error".
     */
    private static final int ZZ_UNKNOWN_ERROR = 0;
    /**
     * Error code for "could not match input".
     */
    private static final int ZZ_NO_MATCH = 1;
    /**
     * Error code for "pushback value was too large".
     */
    private static final int ZZ_PUSHBACK_2BIG = 2;

    /**
     * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
     * {@link #ZZ_PUSHBACK_2BIG} respectively.
     */
    private static final String ZZ_ERROR_MSG[] = {"Unknown internal scanner error", "Error: could not match input", "Error: pushback value was too large"};

    /**
     * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
     */
    private static final int[] ZZ_ATTRIBUTE = zzUnpackAttribute();

    private static final String ZZ_ATTRIBUTE_PACKED_0 = "\1\0\1\11\1\1\1\0\1\11\1\0\7\11\3\1" + "\1\11\7\1\2\11\15\1\1\11\1\0\2\11\1\0" + "\1\11\1\0\2\1\1\0\3\11\34\1\2\11\2\0" + "\36\1\1\0\121\1";

    private static int[] zzUnpackAttribute()
    {
        int[] result = new int[196];
        int offset = 0;
        offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackAttribute(String packed, int offset, int[] result)
    {
        int i = 0;       /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l)
        {
            int count = packed.charAt(i++);
            int value = packed.charAt(i++);
            do
                result[j++] = value; while (--count > 0);
        }
        return j;
    }

    /**
     * Input device.
     */
    private java.io.Reader zzReader;

    /**
     * Current state of the DFA.
     */
    private int zzState;

    /**
     * Current lexical state.
     */
    private int zzLexicalState = YYINITIAL;

    /**
     * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
     * string.
     */
    private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

    /**
     * Text position at the last accepting state.
     */
    private int zzMarkedPos;

    /**
     * Current text position in the buffer.
     */
    private int zzCurrentPos;

    /**
     * Marks the beginning of the {@link #yytext()} string in the buffer.
     */
    private int zzStartRead;

    /**
     * Marks the last character in the buffer, that has been read from input.
     */
    private int zzEndRead;

    /**
     * Whether the scanner is at the end of file.
     *
     * @see #yyatEOF
     */
    private boolean zzAtEOF;

    /**
     * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
     *
     * <p>When a lead/high surrogate has been read from the input stream into the final
     * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
     */
    private int zzFinalHighSurrogate = 0;

    /**
     * Number of newlines encountered up to the start of the matched text.
     */
    private int yyline;

    /**
     * Number of characters from the last newline up to the start of the matched text.
     */
    private int yycolumn;

    /**
     * Number of characters up to the start of the matched text.
     */
    @SuppressWarnings("unused")
    private long yychar;

    /**
     * Whether the scanner is currently at the beginning of a line.
     */
    @SuppressWarnings("unused")
    private boolean zzAtBOL = true;

    /**
     * Whether the user-EOF-code has already been executed.
     */
    private boolean zzEOFDone;

    /* user code: */

    public static Writer writer;

    private Symbol symbol(int type)
    {
        return new Symbol(type, yyline, yycolumn);
    }

    /* Also creates a java_cup.runtime.Symbol with information about the current token, but this object has a value. */
    private Symbol symbol(int type, String value)
    {
        return new Symbol(type, yyline, yycolumn, value);
    }


    /**
     * Creates a new scanner
     *
     * @param in the java.io.Reader to read input from.
     */
    public MyScanner(java.io.Reader in)
    {
        this.zzReader = in;
    }

    /**
     * Translates raw input code points to DFA table row
     */
    private static int zzCMap(int input)
    {
        int offset = input & 255;
        return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
    }

    /**
     * Refills the input buffer.
     *
     * @return {@code false} iff there was new input.
     * @throws java.io.IOException if any I/O-Error occurs
     */
    private boolean zzRefill() throws java.io.IOException
    {

        /* first: make room (if you can) */
        if (zzStartRead > 0)
        {
            zzEndRead += zzFinalHighSurrogate;
            zzFinalHighSurrogate = 0;
            System.arraycopy(zzBuffer, zzStartRead, zzBuffer, 0, zzEndRead - zzStartRead);

            /* translate stored positions */
            zzEndRead -= zzStartRead;
            zzCurrentPos -= zzStartRead;
            zzMarkedPos -= zzStartRead;
            zzStartRead = 0;
        }

        /* is the buffer big enough? */
        if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate)
        {
            /* if not: blow it up */
            char newBuffer[] = new char[zzBuffer.length * 2];
            System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
            zzBuffer = newBuffer;
            zzEndRead += zzFinalHighSurrogate;
            zzFinalHighSurrogate = 0;
        }

        /* fill the buffer with new input */
        int requested = zzBuffer.length - zzEndRead;
        int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

        /* not supposed to occur according to specification of java.io.Reader */
        if (numRead == 0)
        {
            throw new java.io.IOException("Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
        }
        if (numRead > 0)
        {
            zzEndRead += numRead;
            if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1]))
            {
                if (numRead == requested)
                { // We requested too few chars to encode a full Unicode character
                    --zzEndRead;
                    zzFinalHighSurrogate = 1;
                }
                else
                {                    // There is room in the buffer for at least one more char
                    int c = zzReader.read();  // Expecting to read a paired low surrogate char
                    if (c == -1)
                    {
                        return true;
                    }
                    else
                    {
                        zzBuffer[zzEndRead++] = (char) c;
                    }
                }
            }
            /* potentially more input available */
            return false;
        }

        /* numRead < 0 ==> end of stream */
        return true;
    }


    /**
     * Closes the input reader.
     *
     * @throws java.io.IOException if the reader could not be closed.
     */
    public final void yyclose() throws java.io.IOException
    {
        zzAtEOF = true; // indicate end of file
        zzEndRead = zzStartRead; // invalidate buffer

        if (zzReader != null)
        {
            zzReader.close();
        }
    }


    /**
     * Resets the scanner to read from a new input stream.
     *
     * <p>Does not close the old reader.
     *
     * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
     * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
     *
     * <p>Internal scan buffer is resized down to its initial length, if it has grown.
     *
     * @param reader The new input stream.
     */
    public final void yyreset(java.io.Reader reader)
    {
        zzReader = reader;
        zzEOFDone = false;
        yyResetPosition();
        zzLexicalState = YYINITIAL;
        if (zzBuffer.length > ZZ_BUFFERSIZE)
        {
            zzBuffer = new char[ZZ_BUFFERSIZE];
        }
    }

    /**
     * Resets the input position.
     */
    private final void yyResetPosition()
    {
        zzAtBOL = true;
        zzAtEOF = false;
        zzCurrentPos = 0;
        zzMarkedPos = 0;
        zzStartRead = 0;
        zzEndRead = 0;
        zzFinalHighSurrogate = 0;
        yyline = 0;
        yycolumn = 0;
        yychar = 0L;
    }


    /**
     * Returns whether the scanner has reached the end of the reader it reads from.
     *
     * @return whether the scanner has reached EOF.
     */
    public final boolean yyatEOF()
    {
        return zzAtEOF;
    }


    /**
     * Returns the current lexical state.
     *
     * @return the current lexical state.
     */
    public final int yystate()
    {
        return zzLexicalState;
    }


    /**
     * Enters a new lexical state.
     *
     * @param newState the new lexical state
     */
    public final void yybegin(int newState)
    {
        zzLexicalState = newState;
    }


    /**
     * Returns the text matched by the current regular expression.
     *
     * @return the matched text.
     */
    public final String yytext()
    {
        return new String(zzBuffer, zzStartRead, zzMarkedPos - zzStartRead);
    }


    /**
     * Returns the character at the given position from the matched text.
     *
     * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
     *
     * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
     * @return the character at {@code position}.
     */
    public final char yycharat(int position)
    {
        return zzBuffer[zzStartRead + position];
    }


    /**
     * How many characters were matched.
     *
     * @return the length of the matched text region.
     */
    public final int yylength()
    {
        return zzMarkedPos - zzStartRead;
    }


    /**
     * Reports an error that occurred while scanning.
     *
     * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
     * match-all fallback rule) this method will only be called with things that
     * "Can't Possibly Happen".
     *
     * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
     * scanner etc.).
     *
     * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
     *
     * @param errorCode the code of the error message to display.
     */
    private static void zzScanError(int errorCode)
    {
        String message;
        try
        {
            message = ZZ_ERROR_MSG[errorCode];
        } catch (ArrayIndexOutOfBoundsException e)
        {
            message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
        }

        throw new Error(message);
    }


    /**
     * Pushes the specified amount of characters back into the input stream.
     *
     * <p>They will be read again by then next call of the scanning method.
     *
     * @param number the number of characters to be read again. This number must not be greater than
     *               {@link #yylength()}.
     */
    public void yypushback(int number)
    {
        if (number > yylength())
        {
            zzScanError(ZZ_PUSHBACK_2BIG);
        }

        zzMarkedPos -= number;
    }


    /**
     * Contains user EOF-code, which will be executed exactly once,
     * when the end of file is reached
     */
    private void zzDoEOF() throws java.io.IOException
    {
        if (!zzEOFDone)
        {
            zzEOFDone = true;

            yyclose();
        }
    }


    /**
     * Resumes scanning until the next regular expression is matched, the end of input is encountered
     * or an I/O-Error occurs.
     *
     * @return the next token.
     * @throws java.io.IOException if any I/O-Error occurs.
     */
    @Override
    public java_cup.runtime.Symbol next_token() throws java.io.IOException
    {
        int zzInput;
        int zzAction;

        // cached fields:
        int zzCurrentPosL;
        int zzMarkedPosL;
        int zzEndReadL = zzEndRead;
        char[] zzBufferL = zzBuffer;

        int[] zzTransL = ZZ_TRANS;
        int[] zzRowMapL = ZZ_ROWMAP;
        int[] zzAttrL = ZZ_ATTRIBUTE;

        while (true)
        {
            zzMarkedPosL = zzMarkedPos;

            boolean zzR = false;
            int zzCh;
            int zzCharCount;
            for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL; zzCurrentPosL += zzCharCount)
            {
                zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
                zzCharCount = Character.charCount(zzCh);
                switch (zzCh)
                {
                    case '\u000B':  // fall through
                    case '\u000C':  // fall through
                    case '\u0085':  // fall through
                    case '\u2028':  // fall through
                    case '\u2029':
                        yyline++;
                        yycolumn = 0;
                        zzR = false;
                        break;
                    case '\r':
                        yyline++;
                        yycolumn = 0;
                        zzR = true;
                        break;
                    case '\n':
                        if (zzR)
                        {
                            zzR = false;
                        }
                        else
                        {
                            yyline++;
                            yycolumn = 0;
                        }
                        break;
                    default:
                        zzR = false;
                        yycolumn += zzCharCount;
                }
            }

            if (zzR)
            {
                // peek one character ahead if it is
                // (if we have counted one line too much)
                boolean zzPeek;
                if (zzMarkedPosL < zzEndReadL)
                {
                    zzPeek = zzBufferL[zzMarkedPosL] == '\n';
                }
                else if (zzAtEOF)
                {
                    zzPeek = false;
                }
                else
                {
                    boolean eof = zzRefill();
                    zzEndReadL = zzEndRead;
                    zzMarkedPosL = zzMarkedPos;
                    zzBufferL = zzBuffer;
                    if (eof)
                    {
                        zzPeek = false;
                    }
                    else
                    {
                        zzPeek = zzBufferL[zzMarkedPosL] == '\n';
                    }
                }
                if (zzPeek)
                {
                    yyline--;
                }
            }
            zzAction = -1;

            zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

            zzState = ZZ_LEXSTATE[zzLexicalState];

            // set up zzAction for empty match case:
            int zzAttributes = zzAttrL[zzState];
            if ((zzAttributes & 1) == 1)
            {
                zzAction = zzState;
            }


            zzForAction:
            {
                while (true)
                {

                    if (zzCurrentPosL < zzEndReadL)
                    {
                        zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
                        zzCurrentPosL += Character.charCount(zzInput);
                    }
                    else if (zzAtEOF)
                    {
                        zzInput = YYEOF;
                        break zzForAction;
                    }
                    else
                    {
                        // store back cached positions
                        zzCurrentPos = zzCurrentPosL;
                        zzMarkedPos = zzMarkedPosL;
                        boolean eof = zzRefill();
                        // get translated positions and possibly new buffer
                        zzCurrentPosL = zzCurrentPos;
                        zzMarkedPosL = zzMarkedPos;
                        zzBufferL = zzBuffer;
                        zzEndReadL = zzEndRead;
                        if (eof)
                        {
                            zzInput = YYEOF;
                            break zzForAction;
                        }
                        else
                        {
                            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
                            zzCurrentPosL += Character.charCount(zzInput);
                        }
                    }
                    int zzNext = zzTransL[zzRowMapL[zzState] + zzCMap(zzInput)];
                    if (zzNext == -1)
                    {
                        break zzForAction;
                    }
                    zzState = zzNext;

                    zzAttributes = zzAttrL[zzState];
                    if ((zzAttributes & 1) == 1)
                    {
                        zzAction = zzState;
                        zzMarkedPosL = zzCurrentPosL;
                        if ((zzAttributes & 8) == 8)
                        {
                            break zzForAction;
                        }
                    }

                }
            }

            // store back cached position
            zzMarkedPos = zzMarkedPosL;

            if (zzInput == YYEOF && zzStartRead == zzCurrentPos)
            {
                zzAtEOF = true;
                zzDoEOF();
                {
                    return new java_cup.runtime.Symbol(sym.EOF);
                }
            }
            else
            {
                switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction])
                {
                    case 1:
                    { /* ignore whitespace */
                    }
                    // fall through
                    case 64:
                        break;
                    case 2:
                    {
                        return symbol(sym.NOT);
                    }
                    // fall through
                    case 65:
                        break;
                    case 3:
                    {
                        return symbol(sym.MOD);
                    }
                    // fall through
                    case 66:
                        break;
                    case 4:
                    {
                        return symbol(sym.LEFTPAREN);
                    }
                    // fall through
                    case 67:
                        break;
                    case 5:
                    {
                        return symbol(sym.RIGHTPAREN);
                    }
                    // fall through
                    case 68:
                        break;
                    case 6:
                    {
                        return symbol(sym.MULT);
                    }
                    // fall through
                    case 69:
                        break;
                    case 7:
                    {
                        return symbol(sym.PLUS);
                    }
                    // fall through
                    case 70:
                        break;
                    case 8:
                    {
                        return symbol(sym.COMMA);
                    }
                    // fall through
                    case 71:
                        break;
                    case 9:
                    {
                        return symbol(sym.MINUS);
                    }
                    // fall through
                    case 72:
                        break;
                    case 10:
                    {
                        return symbol(sym.DOT);
                    }
                    // fall through
                    case 73:
                        break;
                    case 11:
                    {
                        return symbol(sym.DIV);
                    }
                    // fall through
                    case 74:
                        break;
                    case 12:
                    {
                        return symbol(sym.INTCONSTANT, yytext());
                    }
                    // fall through
                    case 75:
                        break;
                    case 13:
                    {
                        return symbol(sym.SEMICOLON);
                    }
                    // fall through
                    case 76:
                        break;
                    case 14:
                    {
                        return symbol(sym.LT);
                    }
                    // fall through
                    case 77:
                        break;
                    case 15:
                    {
                        return symbol(sym.ASSIGN);
                    }
                    // fall through
                    case 78:
                        break;
                    case 16:
                    {
                        return symbol(sym.GT);
                    }
                    // fall through
                    case 79:
                        break;
                    case 17:
                    {
                        return symbol(sym.IDENTIFIER, yytext());
                    }
                    // fall through
                    case 80:
                        break;
                    case 18:
                    {
                        return symbol(sym.LEFTBRACK);
                    }
                    // fall through
                    case 81:
                        break;
                    case 19:
                    {
                        return symbol(sym.RIGHTBRACK);
                    }
                    // fall through
                    case 82:
                        break;
                    case 20:
                    {
                        return symbol(sym.LEFTAKULAD);
                    }
                    // fall through
                    case 83:
                        break;
                    case 21:
                    {
                        return symbol(sym.RIGHTAKULAD);
                    }
                    // fall through
                    case 84:
                        break;
                    case 22:
                    {
                        return symbol(sym.NOTEQ);
                    }
                    // fall through
                    case 85:
                        break;
                    case 23:
                    {
                        return symbol(sym.ANDAND);
                    }
                    // fall through
                    case 86:
                        break;
                    case 24:
                    { /* ignore comments*/
                    }
                    // fall through
                    case 87:
                        break;
                    case 25:
                    {
                        return symbol(sym.DOUBLECONSTANT, yytext());
                    }
                    // fall through
                    case 88:
                        break;
                    case 26:
                    {
                        return symbol(sym.LTEQ);
                    }
                    // fall through
                    case 89:
                        break;
                    case 27:
                    {
                        return symbol(sym.EQEQ);
                    }
                    // fall through
                    case 90:
                        break;
                    case 28:
                    {
                        return symbol(sym.GTEQ);
                    }
                    // fall through
                    case 91:
                        break;
                    case 29:
                    {
                        return symbol(sym.IF);
                    }
                    // fall through
                    case 92:
                        break;
                    case 30:
                    {
                        return symbol(sym.OROR);
                    }
                    // fall through
                    case 93:
                        break;
                    case 31:
                    {
                        return symbol(sym.STRINGCONSTANT, yytext());
                    }
                    // fall through
                    case 94:
                        break;
                    case 32:
                    {
                        return symbol(sym.INTCONSTANT, yytext());
                    }
                    // fall through
                    case 95:
                        break;
                    case 33:
                    {
                        return symbol(sym.FOR);
                    }
                    // fall through
                    case 96:
                        break;
                    case 34:
                    {
                        return symbol(sym.INT);
                    }
                    // fall through
                    case 97:
                        break;
                    case 35:
                    {
                        return symbol(sym.NEW);
                    }
                    // fall through
                    case 98:
                        break;
                    case 36:
                    {
                        return symbol(sym.DOUBLECONSTANT, yytext());
                    }
                    // fall through
                    case 99:
                        break;
                    case 37:
                    {
                        return symbol(sym.BOOLEAN);
                    }
                    // fall through
                    case 100:
                        break;
                    case 38:
                    {
                        return symbol(sym.BTOI);
                    }
                    // fall through
                    case 101:
                        break;
                    case 39:
                    {
                        return symbol(sym.DTOI);
                    }
                    // fall through
                    case 102:
                        break;
                    case 40:
                    {
                        return symbol(sym.ELSE);
                    }
                    // fall through
                    case 103:
                        break;
                    case 41:
                    {
                        return symbol(sym.ITOB);
                    }
                    // fall through
                    case 104:
                        break;
                    case 42:
                    {
                        return symbol(sym.ITOD);
                    }
                    // fall through
                    case 105:
                        break;
                    case 43:
                    {
                        return symbol(sym.NULL);
                    }
                    // fall through
                    case 106:
                        break;
                    case 44:
                    {
                        return symbol(sym.THIS);
                    }
                    // fall through
                    case 107:
                        break;
                    case 45:
                    {
                        return symbol(sym.BOOLCONSTANT, yytext());
                    }
                    // fall through
                    case 108:
                        break;
                    case 46:
                    {
                        return symbol(sym.VOID);
                    }
                    // fall through
                    case 109:
                        break;
                    case 47:
                    {
                        return symbol(sym.PRINT);
                    }
                    // fall through
                    case 110:
                        break;
                    case 48:
                    {
                        return symbol(sym.BREAK);
                    }
                    // fall through
                    case 111:
                        break;
                    case 49:
                    {
                        return symbol(sym.CLASS);
                    }
                    // fall through
                    case 112:
                        break;
                    case 50:
                    {
                        return symbol(sym.WHILE);
                    }
                    // fall through
                    case 113:
                        break;
                    case 51:
                    {
                        return symbol(sym.DOUBLE);
                    }
                    // fall through
                    case 114:
                        break;
                    case 52:
                    {
                        return symbol(sym.PUBLIC);
                    }
                    // fall through
                    case 115:
                        break;
                    case 53:
                    {
                        return symbol(sym.RETURN);
                    }
                    // fall through
                    case 116:
                        break;
                    case 54:
                    {
                        return symbol(sym.STRING);
                    }
                    // fall through
                    case 117:
                        break;
                    case 55:
                    {
                        return symbol(sym.EXTENDS);
                    }
                    // fall through
                    case 118:
                        break;
                    case 56:
                    {
                        return symbol(sym.PRIVATE);
                    }
                    // fall through
                    case 119:
                        break;
                    case 57:
                    {
                        return symbol(sym.NEWARRAY);
                    }
                    // fall through
                    case 120:
                        break;
                    case 58:
                    {
                        return symbol(sym.READLINE);
                    }
                    // fall through
                    case 121:
                        break;
                    case 59:
                    {
                        return symbol(sym.CONTINUE);
                    }
                    // fall through
                    case 122:
                        break;
                    case 60:
                    {
                        return symbol(sym.INTERFACE);
                    }
                    // fall through
                    case 123:
                        break;
                    case 61:
                    {
                        return symbol(sym.PROTECTED);
                    }
                    // fall through
                    case 124:
                        break;
                    case 62:
                    {
                        return symbol(sym.IMPLEMENTS);
                    }
                    // fall through
                    case 125:
                        break;
                    case 63:
                    {
                        return symbol(sym.READINTEGER);
                    }
                    // fall through
                    case 126:
                        break;
                    default:
                        zzScanError(ZZ_NO_MATCH);
                }
            }
        }
    }

    /**
     * Converts an int token code into the name of the
     * token by reflection on the cup symbol class/interface sym
     */
    private static String getTokenName(int token)
    {
        try
        {
            java.lang.reflect.Field[] classFields = sym.class.getFields();
            for (int i = 0; i < classFields.length; i++)
            {
                if (classFields[i].getInt(null) == token)
                {
                    return classFields[i].getName();
                }
            }
        } catch (Exception e)
        {
            e.printStackTrace(System.err);
        }

        return "UNKNOWN TOKEN";
    }

    /**
     * Same as next_token but also prints the token to standard out
     * for debugging.
     */
    public java_cup.runtime.Symbol debug_next_token() throws java.io.IOException
    {
        java_cup.runtime.Symbol s = next_token();
        System.out.println("line:" + (yyline + 1) + " col:" + (yycolumn + 1) + " --" + yytext() + "--" + getTokenName(s.sym) + "--");
        return s;
    }

    /**
     * Runs the scanner on input files.
     *
     * @param args the command line, contains the filenames to run
     *             the scanner on.
     */
    public static void main(String[] args) throws IOException
    {
        try
        {
            String inputFileName = null;
            String outputFileName = null;
            if (args != null)
            {
                for (int i = 0; i < args.length; i++)
                {
                    if (args[i].equals("-i"))
                    {
                        inputFileName = args[i + 1];
                    }
                    if (args[i].equals("-o"))
                    {
                        outputFileName = args[i + 1];
                    }
                }
            }
            Reader read = null;
            if (inputFileName != null)
            {
                read = new FileReader("../tests/" + inputFileName);
            }
            if (outputFileName != null)
            {
                writer = new FileWriter("../out/" + outputFileName);
            }
            else
            {
                writer = new OutputStreamWriter(System.out);
            }
            Scanner myParser = new MyScanner(read);
            parser parser_ = new parser(myParser);
            parser_.parse();

            try
            {
                SemanticAnalysis.getInstance().startSemanticAnalysis();
            } catch (SemanticError e)
            {
                System.out.println("Semantic Error");
                writer.write("Semantic Error");
                writer.flush();
                writer.close();
            }

            System.out.println("OK");
            writer.write("OK");
            writer.flush();
            writer.close();
        } catch (Exception e)
        {
            String outputFile = null;
            if (args != null)
            {
                for (int i = 0; i < args.length; i++)
                {
                    if (args[i].equals("-o"))
                    {
                        outputFile = args[i + 1];
                    }
                }
            }
            if (outputFile != null)
            {
                writer = new FileWriter("../out/" + outputFile);
            }
            else
            {
                writer = new OutputStreamWriter(System.out);
            }

            System.out.println("Syntax Error");
            writer.write("Syntax Error");
            writer.flush();
            writer.close();
        }
    }
}


class sym
{
    /* terminals */
    public static final int GTEQ = 41;
    public static final int LEFTAKULAD = 14;
    public static final int READLINE = 48;
    public static final int MULT = 35;
    public static final int LTEQ = 39;
    public static final int RIGHTPAREN = 32;
    public static final int DOUBLE = 4;
    public static final int PRIVATE = 16;
    public static final int CONTINUE = 27;
    public static final int INTERFACE = 19;
    public static final int INT = 3;
    public static final int RIGHTAKULAD = 15;
    public static final int FOR = 24;
    public static final int MINUS = 34;
    public static final int LEFTPAREN = 31;
    public static final int OROR = 45;
    public static final int NOT = 46;
    public static final int SEMICOLON = 2;
    public static final int READINTEGER = 47;
    public static final int LT = 38;
    public static final int COMMA = 10;
    public static final int DOUBLECONSTANT = 57;
    public static final int CLASS = 11;
    public static final int ANDAND = 44;
    public static final int DIV = 36;
    public static final int NEWARRAY = 50;
    public static final int BOOLCONSTANT = 58;
    public static final int PLUS = 33;
    public static final int ASSIGN = 29;
    public static final int IF = 21;
    public static final int THIS = 30;
    public static final int DOT = 55;
    public static final int INTCONSTANT = 56;
    public static final int EOF = 0;
    public static final int BOOLEAN = 5;
    public static final int RETURN = 25;
    public static final int STRINGCONSTANT = 59;
    public static final int NEW = 49;
    public static final int error = 1;
    public static final int NULL = 60;
    public static final int EQEQ = 42;
    public static final int MOD = 37;
    public static final int BREAK = 26;
    public static final int VOID = 20;
    public static final int RIGHTBRACK = 9;
    public static final int DTOI = 52;
    public static final int ELSE = 22;
    public static final int PROTECTED = 17;
    public static final int LEFTBRACK = 8;
    public static final int ITOD = 51;
    public static final int ITOB = 53;
    public static final int WHILE = 23;
    public static final int PUBLIC = 18;
    public static final int BTOI = 54;
    public static final int EXTENDS = 12;
    public static final int STRING = 6;
    public static final int GT = 40;
    public static final int IMPLEMENTS = 13;
    public static final int PRINT = 28;
    public static final int NOTEQ = 43;
    public static final int IDENTIFIER = 7;
    public static final String[] terminalNames = new String[]{"EOF", "error", "SEMICOLON", "INT", "DOUBLE", "BOOLEAN", "STRING", "IDENTIFIER", "LEFTBRACK", "RIGHTBRACK", "COMMA", "CLASS", "EXTENDS", "IMPLEMENTS", "LEFTAKULAD", "RIGHTAKULAD", "PRIVATE", "PROTECTED", "PUBLIC", "INTERFACE", "VOID", "IF", "ELSE", "WHILE", "FOR", "RETURN", "BREAK", "CONTINUE", "PRINT", "ASSIGN", "THIS", "LEFTPAREN", "RIGHTPAREN", "PLUS", "MINUS", "MULT", "DIV", "MOD", "LT", "LTEQ", "GT", "GTEQ", "EQEQ", "NOTEQ", "ANDAND", "OROR", "NOT", "READINTEGER", "READLINE", "NEW", "NEWARRAY", "ITOD", "DTOI", "ITOB", "BTOI", "DOT", "INTCONSTANT", "DOUBLECONSTANT", "BOOLCONSTANT", "STRINGCONSTANT", "NULL"};
}

