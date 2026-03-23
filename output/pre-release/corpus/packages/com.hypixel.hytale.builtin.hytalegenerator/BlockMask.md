# BlockMask

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator

public class BlockMask

Configures material-based placement rules that control which blocks can be placed and which existing blocks can be replaced.

## Key Methods

- public boolean canPlace(@Nonnull Material material)
- public boolean canPlace(int materialHash)
- public boolean canReplace(@Nonnull Material source, @Nonnull Material destination)
- public boolean canReplace(int sourceHash, int destinationHash)
- public void setSkippedBlocks(@Nonnull MaterialSet materialSet)
- public void putBlockMaskEntry(@Nonnull MaterialSet source, @Nonnull MaterialSet destination)
- public void setDefaultMask(@Nonnull MaterialSet materialSet)
