package dev.gaussian.signsearcher.ext;

import net.minecraft.block.entity.SignText;

public interface SignBlockEntityExt {
    SignText getFrontText();
    SignText getBackText();
}
