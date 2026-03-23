---
title: "AbstractBan"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.accesscontrol.ban"
fqcn: "com.hypixel.hytale.server.core.modules.accesscontrol.ban.AbstractBan"
api_surface: false
extends: null
implements: ["Ban"]
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
abstract class AbstractBan implements Ban
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `UUID` | `target` |
| `protected final` | `UUID` | `by` |
| `protected final` | `Instant` | `timestamp` |
| `protected final` | `Optional<String>` | `reason` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `UUID` | `getTarget()` |
| `@Override public` | `UUID` | `getBy()` |
| `@Override public` | `Instant` | `getTimestamp()` |
| `@Nonnull @Override public` | `Optional<String>` | `getReason()` |
| `@Nonnull @Override public` | `JsonObject` | `toJsonObject()` |
