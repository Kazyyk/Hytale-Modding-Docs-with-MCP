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
