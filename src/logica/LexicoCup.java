/* The following code was generated by JFlex 1.4.3 on 3/10/21, 5:55 p. m. */

package logica;
import java_cup.runtime.Symbol;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 3/10/21, 5:55 p. m. from the specification file
 * <tt>src/logica/LexicoCup.flex</tt>
 */
class LexicoCup implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  3, 14,  0,  0,  3,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     3, 39, 15, 31,  0, 42, 37, 16, 43, 44, 36, 34, 50, 35, 49, 13, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2, 32, 51, 41, 33, 40,  0, 
     0,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1, 24,  1,  1,  1,  1,  1,  1,  1, 47,  0, 48,  0,  1, 
     0, 20, 10, 18,  7, 12, 23, 22, 19,  4,  1, 27, 11, 28,  5,  8, 
    30,  1, 21, 25,  6,  9,  1, 26, 29, 17,  1, 45, 38, 46,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\10\2\1\5\1\6"+
    "\1\1\11\2\1\1\1\7\1\10\1\11\1\12\1\13"+
    "\3\14\2\15\1\1\1\16\1\17\1\20\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\2\1\27\3\2\1\30"+
    "\11\2\1\4\1\31\1\0\21\2\2\0\1\15\1\32"+
    "\1\14\1\0\1\33\3\2\1\34\14\2\1\35\1\36"+
    "\10\2\1\37\3\2\1\40\7\2\3\0\2\2\1\41"+
    "\5\2\1\42\1\2\1\43\1\44\1\45\3\2\1\46"+
    "\1\2\1\47\2\2\1\50\7\2\1\51\1\2\2\0"+
    "\1\3\4\2\1\52\1\2\1\53\1\54\2\2\1\55"+
    "\1\56\4\2\1\57\1\60\1\2\1\61\1\2\2\0"+
    "\2\2\1\62\2\2\1\63\1\2\1\64\1\2\1\65"+
    "\1\66\1\67\1\70\2\0\1\2\1\71\1\72\3\2"+
    "\1\0\1\73\1\2\1\74\1\75\1\76\1\77\1\100";

  private static int [] zzUnpackAction() {
    int [] result = new int[215];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\64\0\150\0\234\0\320\0\u0104\0\u0138\0\u016c"+
    "\0\u01a0\0\u01d4\0\u0208\0\u023c\0\u0270\0\u02a4\0\64\0\u02d8"+
    "\0\u030c\0\u0340\0\u0374\0\u03a8\0\u03dc\0\u0410\0\u0444\0\u0478"+
    "\0\u04ac\0\u04e0\0\64\0\u0514\0\u0548\0\u057c\0\u05b0\0\u05e4"+
    "\0\u0618\0\u0514\0\u064c\0\u0680\0\u05b0\0\u06b4\0\64\0\64"+
    "\0\64\0\64\0\64\0\64\0\64\0\64\0\u06e8\0\150"+
    "\0\u071c\0\u0750\0\u0784\0\u07b8\0\u07ec\0\u0820\0\u0854\0\u0888"+
    "\0\u08bc\0\u08f0\0\u0924\0\u0958\0\u098c\0\u09c0\0\64\0\u09f4"+
    "\0\u0a28\0\u0a5c\0\u0a90\0\u0ac4\0\u0af8\0\u0b2c\0\u0b60\0\u0b94"+
    "\0\u0bc8\0\u0bfc\0\u0c30\0\u0c64\0\u0c98\0\u0ccc\0\u0d00\0\u0d34"+
    "\0\u0d68\0\u0d9c\0\u0dd0\0\64\0\64\0\64\0\u0e04\0\150"+
    "\0\u0e38\0\u0e6c\0\u0ea0\0\150\0\u0ed4\0\u0f08\0\u0f3c\0\u0f70"+
    "\0\u0fa4\0\u0fd8\0\u100c\0\u1040\0\u1074\0\u10a8\0\u10dc\0\u1110"+
    "\0\64\0\150\0\u1144\0\u1178\0\u11ac\0\u11e0\0\u1214\0\u1248"+
    "\0\u127c\0\u12b0\0\150\0\u12e4\0\u1318\0\u134c\0\150\0\u1380"+
    "\0\u13b4\0\u13e8\0\u141c\0\u1450\0\u1484\0\u14b8\0\u14ec\0\u1520"+
    "\0\u1554\0\u1588\0\u15bc\0\150\0\u15f0\0\u1624\0\u1658\0\u168c"+
    "\0\u16c0\0\150\0\u16f4\0\150\0\150\0\150\0\u1728\0\u175c"+
    "\0\u1790\0\150\0\u17c4\0\150\0\u17f8\0\u182c\0\150\0\u1860"+
    "\0\u1894\0\u18c8\0\u18fc\0\u1930\0\u1964\0\u1998\0\150\0\u19cc"+
    "\0\u1a00\0\u1a34\0\64\0\u1a68\0\u1a9c\0\u1ad0\0\u1b04\0\150"+
    "\0\u1b38\0\150\0\150\0\u1b6c\0\u1ba0\0\150\0\150\0\u1bd4"+
    "\0\u1c08\0\u1c3c\0\u1c70\0\150\0\150\0\u1ca4\0\150\0\u1cd8"+
    "\0\u1d0c\0\u1d40\0\u1d74\0\u1da8\0\150\0\u1ddc\0\u1e10\0\150"+
    "\0\u1e44\0\150\0\u1e78\0\150\0\150\0\150\0\150\0\u1eac"+
    "\0\u1ee0\0\u1f14\0\150\0\150\0\u1f48\0\u1f7c\0\u1fb0\0\u1fe4"+
    "\0\64\0\u2018\0\150\0\150\0\150\0\64\0\150";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[215];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\3\1\12\1\13\1\14\1\15\1\16\1\5\1\17"+
    "\1\20\1\3\1\21\2\3\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\3\1\30\1\3\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
    "\1\54\1\55\1\56\65\0\2\3\1\0\11\3\4\0"+
    "\16\3\27\0\1\4\64\0\1\5\12\0\1\5\46\0"+
    "\2\3\1\0\1\3\1\57\7\3\4\0\6\3\1\60"+
    "\7\3\26\0\2\3\1\0\11\3\4\0\3\3\1\61"+
    "\12\3\26\0\2\3\1\0\11\3\4\0\1\62\3\3"+
    "\1\63\11\3\26\0\2\3\1\0\4\3\1\64\3\3"+
    "\1\65\4\0\16\3\26\0\2\3\1\0\1\3\1\66"+
    "\7\3\4\0\10\3\1\67\5\3\26\0\2\3\1\0"+
    "\11\3\4\0\1\70\3\3\1\71\11\3\26\0\2\3"+
    "\1\0\4\3\1\72\4\3\4\0\16\3\26\0\2\3"+
    "\1\0\1\3\1\73\5\3\1\74\1\3\4\0\14\3"+
    "\1\75\1\3\42\0\1\76\23\0\1\77\42\0\1\100"+
    "\44\0\2\3\1\0\1\101\3\3\1\102\4\3\4\0"+
    "\2\3\1\103\1\104\12\3\26\0\2\3\1\0\10\3"+
    "\1\105\4\0\16\3\26\0\2\3\1\0\4\3\1\106"+
    "\4\3\4\0\16\3\26\0\2\3\1\0\4\3\1\107"+
    "\2\3\1\110\1\3\4\0\3\3\1\111\12\3\26\0"+
    "\2\3\1\0\2\3\1\112\6\3\4\0\16\3\26\0"+
    "\2\3\1\0\2\3\1\113\6\3\4\0\1\3\1\114"+
    "\1\115\6\3\1\116\4\3\26\0\2\3\1\0\11\3"+
    "\4\0\2\3\1\117\13\3\26\0\2\3\1\0\11\3"+
    "\4\0\3\3\1\120\12\3\26\0\2\3\1\0\11\3"+
    "\4\0\4\3\1\121\11\3\31\0\1\122\2\0\1\123"+
    "\115\0\1\124\63\0\1\77\1\125\62\0\1\77\1\0"+
    "\1\125\61\0\1\77\67\0\1\126\64\0\1\126\56\0"+
    "\1\124\6\0\1\124\54\0\1\124\7\0\1\124\55\0"+
    "\1\127\21\0\2\3\1\0\2\3\1\130\6\3\4\0"+
    "\16\3\26\0\2\3\1\0\11\3\4\0\13\3\1\131"+
    "\2\3\26\0\2\3\1\0\11\3\4\0\15\3\1\132"+
    "\26\0\2\3\1\0\5\3\1\133\3\3\4\0\1\134"+
    "\15\3\26\0\2\3\1\0\5\3\1\135\3\3\4\0"+
    "\16\3\26\0\2\3\1\0\11\3\4\0\6\3\1\136"+
    "\7\3\26\0\2\3\1\0\1\137\10\3\4\0\10\3"+
    "\1\140\5\3\26\0\2\3\1\0\1\141\10\3\4\0"+
    "\16\3\26\0\2\3\1\0\2\3\1\142\6\3\4\0"+
    "\16\3\26\0\2\3\1\0\10\3\1\143\4\0\16\3"+
    "\26\0\2\3\1\0\1\3\1\144\7\3\4\0\16\3"+
    "\26\0\2\3\1\0\3\3\1\145\1\3\1\146\3\3"+
    "\4\0\16\3\26\0\2\3\1\0\11\3\4\0\10\3"+
    "\1\147\5\3\26\0\2\3\1\0\2\3\1\150\6\3"+
    "\4\0\16\3\25\0\16\76\1\0\45\76\20\0\1\151"+
    "\44\0\2\3\1\0\1\3\1\152\7\3\4\0\16\3"+
    "\26\0\2\3\1\0\1\3\1\153\3\3\1\154\3\3"+
    "\4\0\16\3\26\0\2\3\1\0\11\3\4\0\3\3"+
    "\1\155\12\3\26\0\2\3\1\0\2\3\1\156\6\3"+
    "\4\0\10\3\1\157\5\3\26\0\2\3\1\0\2\3"+
    "\1\160\6\3\4\0\5\3\1\161\10\3\26\0\2\3"+
    "\1\0\2\3\1\162\6\3\4\0\16\3\26\0\2\3"+
    "\1\0\11\3\4\0\4\3\1\163\11\3\26\0\2\3"+
    "\1\0\4\3\1\164\4\3\4\0\16\3\26\0\2\3"+
    "\1\0\7\3\1\165\1\3\4\0\16\3\26\0\2\3"+
    "\1\0\11\3\4\0\4\3\1\166\11\3\26\0\2\3"+
    "\1\0\3\3\1\167\5\3\4\0\4\3\1\170\11\3"+
    "\26\0\2\3\1\0\11\3\4\0\3\3\1\171\12\3"+
    "\26\0\2\3\1\0\4\3\1\172\4\3\4\0\16\3"+
    "\26\0\2\3\1\0\1\173\10\3\4\0\16\3\26\0"+
    "\2\3\1\0\1\174\10\3\4\0\16\3\26\0\2\3"+
    "\1\0\1\175\10\3\4\0\16\3\26\0\2\3\1\0"+
    "\1\176\10\3\4\0\16\3\32\0\1\177\72\0\1\200"+
    "\51\0\1\201\62\0\2\3\1\0\10\3\1\202\4\0"+
    "\16\3\26\0\2\3\1\0\10\3\1\203\4\0\16\3"+
    "\26\0\2\3\1\0\10\3\1\204\4\0\16\3\26\0"+
    "\2\3\1\0\6\3\1\205\2\3\4\0\16\3\26\0"+
    "\2\3\1\0\11\3\4\0\3\3\1\206\12\3\26\0"+
    "\2\3\1\0\4\3\1\207\4\3\4\0\16\3\26\0"+
    "\2\3\1\0\1\210\10\3\4\0\16\3\26\0\2\3"+
    "\1\0\1\3\1\211\7\3\4\0\16\3\26\0\2\3"+
    "\1\0\10\3\1\212\4\0\16\3\26\0\2\3\1\0"+
    "\11\3\4\0\3\3\1\213\12\3\26\0\2\3\1\0"+
    "\11\3\4\0\5\3\1\212\10\3\26\0\2\3\1\0"+
    "\7\3\1\214\1\3\4\0\16\3\26\0\2\3\1\0"+
    "\11\3\4\0\13\3\1\215\2\3\26\0\2\3\1\0"+
    "\10\3\1\216\4\0\16\3\26\0\2\3\1\0\10\3"+
    "\1\217\4\0\16\3\26\0\2\3\1\0\2\3\1\220"+
    "\6\3\4\0\10\3\1\221\5\3\26\0\2\3\1\0"+
    "\2\3\1\222\6\3\4\0\16\3\26\0\2\3\1\0"+
    "\11\3\4\0\4\3\1\212\11\3\26\0\2\3\1\0"+
    "\11\3\4\0\1\3\1\223\14\3\26\0\2\3\1\0"+
    "\10\3\1\224\4\0\16\3\26\0\2\3\1\0\5\3"+
    "\1\225\3\3\4\0\16\3\26\0\2\3\1\0\1\226"+
    "\10\3\4\0\16\3\26\0\2\3\1\0\4\3\1\227"+
    "\4\3\4\0\16\3\26\0\2\3\1\0\11\3\4\0"+
    "\3\3\1\230\12\3\26\0\2\3\1\0\11\3\4\0"+
    "\10\3\1\133\5\3\26\0\2\3\1\0\1\231\10\3"+
    "\4\0\16\3\26\0\2\3\1\0\5\3\1\232\3\3"+
    "\4\0\16\3\26\0\2\3\1\0\1\3\1\233\7\3"+
    "\4\0\16\3\26\0\2\3\1\0\11\3\4\0\4\3"+
    "\1\234\11\3\26\0\2\3\1\0\2\3\1\235\6\3"+
    "\4\0\16\3\26\0\2\3\1\0\7\3\1\236\1\3"+
    "\4\0\16\3\26\0\2\3\1\0\1\3\1\237\7\3"+
    "\4\0\16\3\26\0\2\3\1\0\1\3\1\240\7\3"+
    "\4\0\16\3\47\0\1\241\70\0\1\242\36\0\1\201"+
    "\51\0\1\243\10\0\2\3\1\0\11\3\4\0\10\3"+
    "\1\244\5\3\26\0\2\3\1\0\3\3\1\245\5\3"+
    "\4\0\16\3\26\0\2\3\1\0\7\3\1\246\1\3"+
    "\4\0\16\3\26\0\2\3\1\0\5\3\1\247\3\3"+
    "\4\0\16\3\26\0\2\3\1\0\1\3\1\250\7\3"+
    "\4\0\16\3\26\0\2\3\1\0\11\3\4\0\5\3"+
    "\1\251\10\3\26\0\2\3\1\0\11\3\4\0\5\3"+
    "\1\252\10\3\26\0\2\3\1\0\11\3\4\0\12\3"+
    "\1\253\3\3\26\0\2\3\1\0\11\3\4\0\4\3"+
    "\1\254\11\3\26\0\2\3\1\0\1\255\10\3\4\0"+
    "\16\3\26\0\2\3\1\0\2\3\1\256\6\3\4\0"+
    "\16\3\26\0\2\3\1\0\11\3\4\0\2\3\1\257"+
    "\13\3\26\0\2\3\1\0\11\3\4\0\4\3\1\260"+
    "\11\3\26\0\2\3\1\0\11\3\4\0\10\3\1\261"+
    "\5\3\26\0\2\3\1\0\2\3\1\212\6\3\4\0"+
    "\16\3\26\0\2\3\1\0\1\3\1\262\7\3\4\0"+
    "\16\3\26\0\2\3\1\0\11\3\4\0\1\3\1\263"+
    "\14\3\26\0\2\3\1\0\11\3\4\0\6\3\1\264"+
    "\7\3\26\0\2\3\1\0\2\3\1\265\6\3\4\0"+
    "\16\3\26\0\2\3\1\0\11\3\4\0\1\3\1\266"+
    "\14\3\26\0\2\3\1\0\10\3\1\267\4\0\16\3"+
    "\26\0\2\3\1\0\2\3\1\270\6\3\4\0\16\3"+
    "\40\0\1\271\54\0\1\272\60\0\2\3\1\0\11\3"+
    "\4\0\15\3\1\273\26\0\2\3\1\0\10\3\1\274"+
    "\4\0\16\3\26\0\2\3\1\0\10\3\1\275\4\0"+
    "\16\3\26\0\2\3\1\0\7\3\1\276\1\3\4\0"+
    "\16\3\26\0\2\3\1\0\1\3\1\277\7\3\4\0"+
    "\16\3\26\0\2\3\1\0\1\3\1\300\7\3\4\0"+
    "\16\3\26\0\2\3\1\0\1\3\1\301\7\3\4\0"+
    "\16\3\26\0\2\3\1\0\1\3\1\302\7\3\4\0"+
    "\16\3\26\0\2\3\1\0\2\3\1\303\6\3\4\0"+
    "\16\3\26\0\2\3\1\0\11\3\4\0\5\3\1\304"+
    "\10\3\26\0\2\3\1\0\2\3\1\305\6\3\4\0"+
    "\16\3\26\0\2\3\1\0\11\3\4\0\2\3\1\306"+
    "\13\3\26\0\2\3\1\0\11\3\4\0\6\3\1\307"+
    "\7\3\36\0\1\310\57\0\1\311\57\0\2\3\1\0"+
    "\11\3\4\0\3\3\1\312\12\3\26\0\2\3\1\0"+
    "\11\3\4\0\6\3\1\313\7\3\26\0\2\3\1\0"+
    "\2\3\1\314\6\3\4\0\16\3\26\0\2\3\1\0"+
    "\10\3\1\315\4\0\16\3\26\0\2\3\1\0\5\3"+
    "\1\316\3\3\4\0\16\3\26\0\2\3\1\0\10\3"+
    "\1\317\4\0\16\3\34\0\1\320\70\0\1\321\50\0"+
    "\2\3\1\0\11\3\4\0\1\3\1\322\14\3\26\0"+
    "\2\3\1\0\3\3\1\323\5\3\4\0\16\3\26\0"+
    "\2\3\1\0\10\3\1\324\4\0\16\3\26\0\2\3"+
    "\1\0\11\3\4\0\4\3\1\325\11\3\41\0\1\326"+
    "\50\0\2\3\1\0\10\3\1\327\4\0\16\3\25\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8268];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\14\1\1\11\13\1\1\11\13\1\10\11"+
    "\20\1\1\11\1\0\21\1\2\0\3\11\1\0\21\1"+
    "\1\11\25\1\3\0\37\1\2\0\1\11\25\1\2\0"+
    "\15\1\2\0\6\1\1\0\1\11\4\1\1\11\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[215];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexicoCup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  LexicoCup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 60: 
          { return new Symbol(sym.Unsigned, yychar, yyline, yytext());
          }
        case 65: break;
        case 15: 
          { return new Symbol(sym.Parent_c, yychar, yyline, yytext());
          }
        case 66: break;
        case 64: 
          { return new Symbol(sym.Namespace, yychar, yyline, yytext());
          }
        case 67: break;
        case 16: 
          { return new Symbol(sym.Llave_a, yychar, yyline, yytext());
          }
        case 68: break;
        case 53: 
          { return new Symbol(sym.Cadena, yychar, yyline, yytext());
          }
        case 69: break;
        case 27: 
          { return new Symbol(sym.Int, yychar, yyline, yytext());
          }
        case 70: break;
        case 55: 
          { return new Symbol(sym.Switch, yychar, yyline, yytext());
          }
        case 71: break;
        case 44: 
          { return new Symbol(sym.Break, yychar, yyline, yytext());
          }
        case 72: break;
        case 25: 
          { return new Symbol(sym.Op_atribucion, yychar, yyline, yytext());
          }
        case 73: break;
        case 37: 
          { return new Symbol(sym.Else, yychar, yyline, yytext());
          }
        case 74: break;
        case 30: 
          { return new Symbol(sym.Cin, yychar, yyline, yytext());
          }
        case 75: break;
        case 12: 
          { return new Symbol(sym.Op_logico, yychar, yyline, yytext());
          }
        case 76: break;
        case 18: 
          { return new Symbol(sym.Corchete_a, yychar, yyline, yytext());
          }
        case 77: break;
        case 47: 
          { return new Symbol(sym.Scanf, yychar, yyline, yytext());
          }
        case 78: break;
        case 5: 
          { return new Symbol(sym.Division, yychar, yyline, yytext());
          }
        case 79: break;
        case 48: 
          { return new Symbol(sym.Short, yychar, yyline, yytext());
          }
        case 80: break;
        case 24: 
          { return new Symbol(sym.Do, yychar, yyline, yytext());
          }
        case 81: break;
        case 45: 
          { return new Symbol(sym.Const, yychar, yyline, yytext());
          }
        case 82: break;
        case 6: 
          { return new Symbol(sym.Comillas, yychar, yyline, yytext());
          }
        case 83: break;
        case 31: 
          { return new Symbol(sym.For, yychar, yyline, yytext());
          }
        case 84: break;
        case 34: 
          { return new Symbol(sym.T_dato, yychar, yyline, yytext());
          }
        case 85: break;
        case 61: 
          { return new Symbol(sym.Continue, yychar, yyline, yytext());
          }
        case 86: break;
        case 10: 
          { return new Symbol(sym.Resta, yychar, yyline, yytext());
          }
        case 87: break;
        case 54: 
          { return new Symbol(sym.Struct , yychar, yyline, yytext());
          }
        case 88: break;
        case 36: 
          { return new Symbol(sym.Enum, yychar, yyline, yytext());
          }
        case 89: break;
        case 58: 
          { return new Symbol(sym.Default, yychar, yyline, yytext());
          }
        case 90: break;
        case 42: 
          { return new Symbol(sym.Union, yychar, yyline, yytext());
          }
        case 91: break;
        case 32: 
          { return new Symbol(sym.Std, yychar, yyline, yytext());
          }
        case 92: break;
        case 17: 
          { return new Symbol(sym.Llave_c, yychar, yyline, yytext());
          }
        case 93: break;
        case 56: 
          { return new Symbol(sym.Printf, yychar, yyline, yytext());
          }
        case 94: break;
        case 40: 
          { return new Symbol(sym.Goto, yychar, yyline, yytext());
          }
        case 95: break;
        case 52: 
          { return new Symbol(sym.Return, yychar, yyline, yytext());
          }
        case 96: break;
        case 19: 
          { return new Symbol(sym.Corchete_c, yychar, yyline, yytext());
          }
        case 97: break;
        case 23: 
          { return new Symbol(sym.If, yychar, yyline, yytext());
          }
        case 98: break;
        case 26: 
          { return new Symbol(sym.Op_incremento, yychar, yyline, yytext());
          }
        case 99: break;
        case 59: 
          { return new Symbol(sym.Define, yychar, yyline, yytext());
          }
        case 100: break;
        case 57: 
          { return new Symbol(sym.Typedef, yychar, yyline, yytext());
          }
        case 101: break;
        case 39: 
          { return new Symbol(sym.Case, yychar, yyline, yytext());
          }
        case 102: break;
        case 41: 
          { return new Symbol(sym.Main, yychar, yyline, yytext());
          }
        case 103: break;
        case 62: 
          { return new Symbol(sym.Register, yychar, yyline, yytext());
          }
        case 104: break;
        case 43: 
          { return new Symbol(sym.Using, yychar, yyline, yytext());
          }
        case 105: break;
        case 14: 
          { return new Symbol(sym.Parent_a, yychar, yyline, yytext());
          }
        case 106: break;
        case 22: 
          { return new Symbol(sym.P_coma, yychar, yyline, yytext());
          }
        case 107: break;
        case 38: 
          { return new Symbol(sym.Cout, yychar, yyline, yytext());
          }
        case 108: break;
        case 11: 
          { return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());
          }
        case 109: break;
        case 63: 
          { return new Symbol(sym.Include, yychar, yyline, yytext());
          }
        case 110: break;
        case 51: 
          { return new Symbol(sym.Extern, yychar, yyline, yytext());
          }
        case 111: break;
        case 9: 
          { return new Symbol(sym.Suma, yychar, yyline, yytext());
          }
        case 112: break;
        case 7: 
          { return new Symbol(sym.D_puntos, yychar, yyline, yytext());
          }
        case 113: break;
        case 1: 
          { return new Symbol(sym.ERROR, yychar, yyline, yytext());
          }
        case 114: break;
        case 50: 
          { return new Symbol(sym.Doble, yychar, yyline, yytext());
          }
        case 115: break;
        case 49: 
          { return new Symbol(sym.While, yychar, yyline, yytext());
          }
        case 116: break;
        case 20: 
          { return new Symbol(sym.Punto, yychar, yyline, yytext());
          }
        case 117: break;
        case 35: 
          { return new Symbol(sym.Endl, yychar, yyline, yytext());
          }
        case 118: break;
        case 4: 
          { /*Ignore*/
          }
        case 119: break;
        case 28: 
          { return new Symbol(sym.Try, yychar, yyline, yytext());
          }
        case 120: break;
        case 8: 
          { return new Symbol(sym.Igual, yychar, yyline, yytext());
          }
        case 121: break;
        case 21: 
          { return new Symbol(sym.Coma, yychar, yyline, yytext());
          }
        case 122: break;
        case 2: 
          { return new Symbol(sym.Identificador, yychar, yyline, yytext());
          }
        case 123: break;
        case 3: 
          { return new Symbol(sym.Numero, yychar, yyline, yytext());
          }
        case 124: break;
        case 46: 
          { return new Symbol(sym.Catch, yychar, yyline, yytext());
          }
        case 125: break;
        case 13: 
          { return new Symbol(sym.Op_relacional, yychar, yyline, yytext());
          }
        case 126: break;
        case 33: 
          { return new Symbol(sym.Op_booleano, yychar, yyline, yytext());
          }
        case 127: break;
        case 29: 
          { return new Symbol(sym.Sencilla, yychar, yyline, yytext());
          }
        case 128: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
