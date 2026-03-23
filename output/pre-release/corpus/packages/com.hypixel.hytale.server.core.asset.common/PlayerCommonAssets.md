# PlayerCommonAssets

Type: class | Package: com.hypixel.hytale.server.core.asset.common

public class PlayerCommonAssets

Tracks which common assets a specific player has received. Maintains maps of missing and sent asset hashes to manage incremental asset delivery during world loading.

## Constructors

- PlayerCommonAssets(@Nonnull Asset[] requiredAssets)

## Methods

- public void sent(@Nullable Asset[] hashes)
