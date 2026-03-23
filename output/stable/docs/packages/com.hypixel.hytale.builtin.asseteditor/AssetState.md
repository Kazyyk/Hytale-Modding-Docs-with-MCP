---
title: "AssetState"
kind: "enum"
package: "com.hypixel.hytale.builtin.asseteditor.data"
fqcn: "com.hypixel.hytale.builtin.asseteditor.data.AssetState"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "builtin"
  - "asseteditor"
  - "data"
---

**Package:** `com.hypixel.hytale.builtin.asseteditor.data`

```java
public enum AssetState { CHANGED, NEW, DELETED }
```

Describes the modification state of an asset in the editor's recent modifications tracker.

## Values

| Value | Description |
|---|---|
| `CHANGED` | An existing asset was modified |
| `NEW` | A new asset was created |
| `DELETED` | An asset was deleted |
