# BrushShapeArg

Type: class | Package: com.hypixel.hytale.server.core.asset.type.buildertool.config.args | Extends: ToolArg<BrushShape>

public class BrushShapeArg extends ToolArg<BrushShape>

Extends `ToolArg` to provide BrushShapeArg functionality.

## Constants

- public static final EnumCodec<BrushShape> BRUSH_SHAPE_CODEC

## Methods

- public BrushShapeArg()
- public BrushShapeArg(BrushShape value)
- @Nonnull @Override public Codec<BrushShape> getCodec()
- @Nonnull public BrushShape fromString(@Nonnull String str)
- @Nonnull public BuilderToolBrushShapeArg toBrushShapeArgPacket()
- @Override protected void setupPacket(@Nonnull BuilderToolArg packet)
- @Nonnull @Override public String toString()
