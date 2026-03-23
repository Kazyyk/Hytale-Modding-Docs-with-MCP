# ClassTransformer

Type: interface | Package: com.hypixel.hytale.plugin.early

public interface ClassTransformer

Interface defining: `transform()`.

## Methods

- priority() | int | package-private method.
- transform(@Nonnull String var1, @Nonnull String var2, @Nonnull byte[] var3) | byte[] | package-private method.

Also in this package: EarlyPluginLoader, TransformingClassLoader

Complete API:
  default int priority()
  byte[] transform(String var1, String var2, byte[] var3)
