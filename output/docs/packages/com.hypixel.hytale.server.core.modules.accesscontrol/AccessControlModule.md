---
title: "AccessControlModule"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.accesscontrol"
fqcn: "com.hypixel.hytale.server.core.modules.accesscontrol.AccessControlModule"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "modules"
  - "accesscontrol"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.accesscontrol`

```java
public class AccessControlModule extends JavaPlugin
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `PluginManifest` | `MANIFEST` |
| `private static` | `AccessControlModule` | `instance` |
| `private final` | `HytaleWhitelistProvider` | `whitelistProvider` |
| `private final` | `HytaleBanProvider` | `banProvider` |
| `private final` | `List<AccessProvider>` | `providerRegistry` |
| `private final` | `Map<String,BanParser>` | `parsers` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `AccessControlModule` | `get()` |
| `@Override protected` | `void` | `setup()` |
| `@Override protected` | `void` | `start()` |
| `@Override protected` | `void` | `shutdown()` |
| `public` | `void` | `registerBanParser(String type, BanParser banParser)` |
| `public` | `void` | `registerAccessProvider(AccessProvider provider)` |
| `public` | `Ban` | `parseBan(String type, JsonObject object)` |
| `@Nonnull private` | `CompletableFuture<Optional<String>>` | `getDisconnectReason(UUID uuid)` |
