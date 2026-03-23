# BlockArg

Type: class | Package: com.hypixel.hytale.server.core.asset.type.buildertool.config.args | Extends: ToolArg<BlockPattern>

public class BlockArg extends ToolArg<BlockPattern>

Extends `ToolArg` to provide BlockArg functionality.

## Constants

- public static final BlockArg[] EMPTY_ARRAY

## Fields

- protected boolean allowPattern

## Methods

- public BlockArg()
- public BlockArg(BlockPattern value, boolean allowPattern)
- @Nonnull @Override public Codec<BlockPattern> getCodec()
- @Nonnull public BlockPattern fromString(@Nonnull String str)
- @Nonnull public BuilderToolBlockArg toBlockArgPacket()
- @Override protected void setupPacket(@Nonnull BuilderToolArg packet)
- @Nonnull @Override public String toString()
