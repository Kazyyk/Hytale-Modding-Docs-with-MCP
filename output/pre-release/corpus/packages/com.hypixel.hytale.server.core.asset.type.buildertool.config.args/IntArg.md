# IntArg

Type: class | Package: com.hypixel.hytale.server.core.asset.type.buildertool.config.args | Extends: ToolArg<Integer>

public class IntArg extends ToolArg<Integer>

Extends `ToolArg` to provide IntArg functionality.

## Fields

- protected int min
- protected int max

## Methods

- public IntArg()
- public IntArg(int value, int min, int max)
- @Nonnull @Override public Codec<Integer> getCodec()
- public int getMin()
- public int getMax()
- @Nonnull public Integer fromString(@Nonnull String str)
- @Nonnull public BuilderToolIntArg toIntArgPacket()
- @Override protected void setupPacket(@Nonnull BuilderToolArg packet)
- @Nonnull @Override public String toString()

Also in this package: BlockArg, BoolArg, BrushAxisArg, BrushOriginArg, BrushRotationArg, BrushShapeArg, FloatArg, MaskArg, OptionArg, StringArg, ToolArg, ToolArgException

Complete API:
  public Codec<Integer> getCodec()
  public int getMin()
  public int getMax()
  public Integer fromString(String str)
  public BuilderToolIntArg toIntArgPacket()
  protected void setupPacket(BuilderToolArg packet)
  public String toString()

Fields:
public static final BuilderCodec<IntArg> CODEC
protected int min
protected int max
