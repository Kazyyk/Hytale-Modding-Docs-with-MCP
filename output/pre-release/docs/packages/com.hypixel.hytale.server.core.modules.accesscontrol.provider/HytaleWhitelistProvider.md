---
title: "HytaleWhitelistProvider"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.accesscontrol.provider"
fqcn: "com.hypixel.hytale.server.core.modules.accesscontrol.provider.HytaleWhitelistProvider"
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
public class HytaleWhitelistProvider extends BlockingDiskFile implements AccessProvider
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `String` | `WHITELIST_FILE_PATH` |
| `private final` | `ReadWriteLock` | `lock` |
| `private final` | `Set<UUID>` | `whitelist` |
| `private` | `boolean` | `isEnabled` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `read(BufferedReader fileReader)` |
| `@Override protected` | `void` | `write(BufferedWriter fileWriter) throws IOException` |
| `@Override protected` | `void` | `create(BufferedWriter fileWriter) throws IOException` |
| `@Nonnull @Override public` | `CompletableFuture<Optional<String>>` | `getDisconnectReason(UUID uuid)` |
| `public` | `void` | `setEnabled(boolean isEnabled)` |
| `public` | `boolean` | `modify(Function<Set<UUID>,Boolean> consumer)` |
| `@Nonnull public` | `Set<UUID>` | `getList()` |
| `public` | `boolean` | `isEnabled()` |
