# ResourceCommonAsset

Type: class | Package: com.hypixel.hytale.server.core.asset.common | Extends: CommonAsset

public class ResourceCommonAsset extends CommonAsset

A common asset backed by a Java classpath resource. Loads binary data via `Class.getResourceAsStream`.

## Methods

- public String getPath()
- @Nonnull @Override protected CompletableFuture<byte[]> getBlob0()
- @Nullable public static ResourceCommonAsset of(@Nonnull Class<?> clazz, @Nonnull String path, @Nonnull String name)
