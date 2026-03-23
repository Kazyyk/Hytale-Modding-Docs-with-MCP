# CommonAsset

Type: class | Package: com.hypixel.hytale.server.core.asset.common | Implements: NetworkSerializable<Asset>

public abstract class CommonAsset implements NetworkSerializable<Asset>

Base class for assets distributed to clients via the common asset system. Each asset has a name, a SHA-256 hash, and lazily loaded binary blob data. Subclasses provide the mechanism for retrieving the raw bytes (file, resource, etc.).

## Constants

- public static final int HASH_LENGTH
- public static final Pattern HASH_PATTERN

## Methods

- @Nonnull public String getName()
- @Nonnull public String getHash()
- public CompletableFuture<byte[]> getBlob()
- protected abstract CompletableFuture<byte[]> getBlob0()
- @Nonnull public Asset toPacket()
- @Nonnull public static String hash(byte[] bytes)
