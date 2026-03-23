# BrushOriginArg

Type: class | Package: com.hypixel.hytale.server.core.asset.type.buildertool.config.args | Extends: ToolArg<BrushOrigin>

public class BrushOriginArg extends ToolArg<BrushOrigin>

Extends `ToolArg` to provide BrushOriginArg functionality.

## Constants

- public static final EnumCodec<BrushOrigin> BRUSH_ORIGIN_CODEC

## Methods

- public BrushOriginArg()
- public BrushOriginArg(BrushOrigin value)
- @Nonnull @Override public Codec<BrushOrigin> getCodec()
- @Nonnull public BrushOrigin fromString(@Nonnull String str)
- @Nonnull public BuilderToolBrushOriginArg toBrushOriginArgPacket()
- @Override protected void setupPacket(@Nonnull BuilderToolArg packet)
- @Nonnull @Override public String toString()
