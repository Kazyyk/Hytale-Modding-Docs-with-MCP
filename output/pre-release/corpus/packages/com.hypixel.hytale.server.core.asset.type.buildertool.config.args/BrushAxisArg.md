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

Also in this package: BlockArg, BoolArg, BrushOriginArg, BrushRotationArg, BrushShapeArg, FloatArg, IntArg, MaskArg, OptionArg, StringArg, ToolArg, ToolArgException

Complete API:
  public Codec<BrushAxis> getCodec()
  public BrushAxis fromString(String str)
  public BuilderToolBrushAxisArg toBrushAxisArgPacket()
  protected void setupPacket(BuilderToolArg packet)
  public String toString()

Fields:
public static final Codec<BrushAxis> BRUSH_AXIS_CODEC
public static final BuilderCodec<BrushAxisArg> CODEC
