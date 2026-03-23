---
title: "HytaleBanProvider"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.accesscontrol.provider"
fqcn: "com.hypixel.hytale.server.core.modules.accesscontrol.provider.HytaleBanProvider"
api_surface: false
extends: "BlockingDiskFile"
implements: ["AccessProvider"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "modules"
  - "accesscontrol"
  - "provider"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.accesscontrol.provider`

```java
public class HytaleBanProvider extends BlockingDiskFile implements AccessProvider
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Map<UUID,Ban>` | `bans` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `CompletableFuture<Optional<String>>` | `getDisconnectReason(UUID uuid)` |
| `@Override protected` | `void` | `read(BufferedReader fileReader)` |
| `@Override protected` | `void` | `write(BufferedWriter fileWriter) throws IOException` |
| `@Override protected` | `void` | `create(BufferedWriter fileWriter) throws IOException` |
| `public` | `boolean` | `hasBan(UUID uuid)` |
| `public` | `boolean` | `modify(Function<Map<UUID,Ban>,Boolean> function)` |
