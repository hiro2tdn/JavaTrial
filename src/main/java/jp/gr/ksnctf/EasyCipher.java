package jp.gr.ksnctf;

public class EasyCipher {
    public static void main(String[] args) throws Exception {

        String text = "EBG KVVV vf n fvzcyr yrggre fhofgvghgvba pvcure gung ercynprf n yrggre jvgu gur yrggre KVVV yrggref nsgre vg va gur nycunorg. EBG KVVV vf na rknzcyr bs gur Pnrfne pvcure, qrirybcrq va napvrag Ebzr. Synt vf SYNTFjmtkOWFNZdjkkNH. Vafreg na haqrefpber vzzrqvngryl nsgre SYNT."; // 暗号化する文字
        StringBuilder data = new StringBuilder(); // 暗号化後データ格納
        int no = 13; // ずらす文字数(ROT13の場合は、13に)

        for (char c : text.toCharArray()) {
            if ('a' <= c && c <= 'z') {
                c = (char) (c + no);
                while ('z' < c) {
                    c = (char) (c - 26);
                }
            } else if ('A' <= c && c <= 'Z') {
                c = (char) (c + no);
                while ('Z' < c) {
                    c = (char) (c - 26);
                }
            }
            data.append(c);
        }

        System.out.println("元データ：" + text);
        System.out.println("後データ：" + data);
    }
}
