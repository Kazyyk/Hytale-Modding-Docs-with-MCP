---
title: "EventKind"
kind: "enum"
package: "com.hypixel.hytale.server.core.asset.monitor"
fqcn: "com.hypixel.hytale.server.core.asset.monitor.EventKind"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "asset"
  - "monitor"
  - "enum"
---

**Package:** `com.hypixel.hytale.server.core.asset.monitor`

```java
public enum EventKind
```

Enumerates EventKind values: `ENTRY_CREATE`, `ENTRY_DELETE`, `ENTRY_MODIFY`.

## Enum Constants

| Constant |
|---|
| `ENTRY_CREATE` |
| `ENTRY_DELETE` |
| `ENTRY_MODIFY` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `EventKind` | `parse(Kind<Path> kind)` |
