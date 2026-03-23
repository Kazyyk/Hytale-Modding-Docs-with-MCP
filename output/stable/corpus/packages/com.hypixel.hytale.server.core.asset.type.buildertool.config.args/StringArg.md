# StringArg

Type: class | Package: com.hypixel.hytale.server.core.asset.type.buildertool.config.args | Extends: ToolArg<String>

public class StringArg extends ToolArg<String>

Extends `ToolArg` to provide StringArg functionality.

## Constants

- public static final StringArg[] EMPTY_ARRAY

## Methods

- public StringArg()
- public StringArg(String value)
- @Nonnull @Override public Codec<String> getCodec()
- @Nonnull public String fromString(@Nonnull String str)
- @Nonnull public BuilderToolStringArg toStringArgPacket()
- @Override protected void setupPacket(@Nonnull BuilderToolArg packet)
- @Nonnull @Override public String toString()

Also in this package: BlockArg, BoolArg, BrushAxisArg, BrushOriginArg, BrushRotationArg, BrushShapeArg, FloatArg, IntArg, MaskArg, OptionArg, ToolArg, ToolArgException

Complete API:
  public Codec<String> getCodec()
  public String fromString(String str)
  public BuilderToolStringArg toStringArgPacket()
  protected void setupPacket(BuilderToolArg packet)
  public String toString()

Fields:
public static final StringArg[] EMPTY_ARRAY
public static final BuilderCodec<StringArg> CODEC
