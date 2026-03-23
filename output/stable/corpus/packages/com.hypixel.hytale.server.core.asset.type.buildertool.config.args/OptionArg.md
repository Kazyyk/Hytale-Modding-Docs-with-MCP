# OptionArg

Type: class | Package: com.hypixel.hytale.server.core.asset.type.buildertool.config.args | Extends: ToolArg<String>

public class OptionArg extends ToolArg<String>

Extends `ToolArg` to provide OptionArg functionality.

## Fields

- protected String[] options

## Methods

- public OptionArg()
- public OptionArg(String value, String[] options)
- @Nonnull @Override public Codec<String> getCodec()
- @Nonnull public String fromString(@Nonnull String str)
- @Nonnull public BuilderToolOptionArg toOptionArgPacket()
- @Override protected void setupPacket(@Nonnull BuilderToolArg packet)
- @Nonnull @Override public String toString()
