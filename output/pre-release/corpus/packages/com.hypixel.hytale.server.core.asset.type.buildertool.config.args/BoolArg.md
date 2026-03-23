# BoolArg

Type: class | Package: com.hypixel.hytale.server.core.asset.type.buildertool.config.args | Extends: ToolArg<Boolean>

public class BoolArg extends ToolArg<Boolean>

Extends `ToolArg` to provide BoolArg functionality.

## Methods

- public BoolArg()
- public BoolArg(boolean value)
- @Nonnull @Override public Codec<Boolean> getCodec()
- @Nonnull public Boolean fromString(@Nonnull String str)
- @Nonnull public BuilderToolBoolArg toBoolArgPacket()
- @Override protected void setupPacket(@Nonnull BuilderToolArg packet)
- @Nonnull @Override public String toString()
