# MaskArg

Type: class | Package: com.hypixel.hytale.server.core.asset.type.buildertool.config.args | Extends: ToolArg<BlockMask>

public class MaskArg extends ToolArg<BlockMask>

Extends `ToolArg` to provide MaskArg functionality.

## Constants

- public static final MaskArg EMPTY

## Methods

- public MaskArg()
- public MaskArg(BlockMask value)
- public MaskArg(BlockMask value, boolean required)
- @Nonnull @Override public Codec<BlockMask> getCodec()
- @Nonnull public BlockMask fromString(@Nonnull String str)
- @Nonnull public BuilderToolMaskArg toMaskArgPacket()
- @Override protected void setupPacket(@Nonnull BuilderToolArg packet)
- @Nonnull @Override public String toString()
