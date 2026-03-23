# AccessProvider

Type: interface | Package: com.hypixel.hytale.server.core.modules.accesscontrol.provider

public interface AccessProvider

## Methods

- @Nonnull CompletableFuture<Optional<String>> getDisconnectReason(UUID var1)

Known implementors: Ban, ClientDelegatingProvider, HytaleBanProvider, HytaleWhitelistProvider

Also in this package: ClientDelegatingProvider, HytaleBanProvider, HytaleWhitelistProvider

Complete API:
  CompletableFuture<Optional<Message>> getDisconnectReason(UUID var1)
