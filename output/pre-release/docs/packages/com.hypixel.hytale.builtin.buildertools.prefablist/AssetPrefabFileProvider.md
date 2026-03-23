---
title: "AssetPrefabFileProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.prefablist"
fqcn: "com.hypixel.hytale.builtin.buildertools.prefablist.AssetPrefabFileProvider"
api_surface: false
extends: null
implements: ["FileListProvider"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "buildertools"
  - "prefab"
  - "ui"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.prefablist`

```java
public class AssetPrefabFileProvider implements FileListProvider
```

Implements `FileListProvider` to list prefab files from all registered asset packs. Supports directory browsing and substring search across prefab directories, returning entries sorted alphabetically with base asset pack prioritized.
