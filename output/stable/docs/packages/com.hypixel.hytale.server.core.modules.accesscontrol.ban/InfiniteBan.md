---
title: "InfiniteBan"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.accesscontrol.ban"
fqcn: "com.hypixel.hytale.server.core.modules.accesscontrol.ban.InfiniteBan"
api_surface: false
extends: "AbstractBan"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "modules"
  - "accesscontrol"
  - "ban"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.accesscontrol.ban`

```java
public class InfiniteBan extends AbstractBan
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `InfiniteBan` | `fromJsonObject(JsonObject object) throws JsonParseException` |
| `@Override public` | `boolean` | `isInEffect()` |
| `@Nonnull @Override public` | `String` | `getType()` |
| `@Nonnull @Override public` | `CompletableFuture<Optional<String>>` | `getDisconnectReason(UUID uuid)` |
