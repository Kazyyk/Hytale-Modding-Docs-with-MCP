---
title: "PlayerCommonAssets"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.common"
fqcn: "com.hypixel.hytale.server.core.asset.common.PlayerCommonAssets"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "asset"
  - "common"
---

**Package:** `com.hypixel.hytale.server.core.asset.common`

```java
public class PlayerCommonAssets
```

Tracks which common assets a specific player has received. Maintains maps of missing and sent asset hashes to manage incremental asset delivery during world loading.

## Constructors

| Signature |
|---|
| `PlayerCommonAssets(@Nonnull Asset[] requiredAssets)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `sent(@Nullable Asset[] hashes)` |
