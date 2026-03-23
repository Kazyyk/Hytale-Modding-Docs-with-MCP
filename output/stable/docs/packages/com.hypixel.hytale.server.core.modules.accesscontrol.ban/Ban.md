---
title: "Ban"
kind: "interface"
package: "com.hypixel.hytale.server.core.modules.accesscontrol.ban"
fqcn: "com.hypixel.hytale.server.core.modules.accesscontrol.ban.Ban"
api_surface: false
extends: null
implements: ["AccessProvider"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "modules"
  - "accesscontrol"
  - "ban"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.core.modules.accesscontrol.ban`

```java
public interface Ban extends AccessProvider
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `UUID` | `getTarget()` |
| `` | `UUID` | `getBy()` |
| `` | `Instant` | `getTimestamp()` |
| `` | `boolean` | `isInEffect()` |
| `` | `Optional<String>` | `getReason()` |
| `` | `String` | `getType()` |
| `` | `JsonObject` | `toJsonObject()` |
