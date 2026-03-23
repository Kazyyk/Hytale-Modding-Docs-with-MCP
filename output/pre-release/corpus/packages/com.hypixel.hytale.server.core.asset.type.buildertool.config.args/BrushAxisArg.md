# BrushAxisArg

Type: class | Package: com.hypixel.hytale.server.core.asset.type.buildertool.config.args | Extends: ToolArg<BrushAxis>

public class BrushAxisArg extends ToolArg<BrushAxis>

Extends `ToolArg` to provide BrushAxisArg functionality.

## Constants

- public static final Codec<BrushAxis> BRUSH_AXIS_CODEC

## Methods

- public BrushAxisArg()
- public BrushAxisArg(BrushAxis value)
- @Nonnull @Override public Codec<BrushAxis> getCodec()
- @Nonnull public BrushAxis fromString(@Nonnull String str)
- @Nonnull public BuilderToolBrushAxisArg toBrushAxisArgPacket()
- @Override protected void setupPacket(@Nonnull BuilderToolArg packet)
- @Nonnull @Override public String toString()
