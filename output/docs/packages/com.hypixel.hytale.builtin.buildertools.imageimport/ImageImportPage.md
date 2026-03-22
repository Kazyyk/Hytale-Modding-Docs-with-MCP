---
title: "ImageImportPage"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.imageimport"
fqcn: "com.hypixel.hytale.builtin.buildertools.imageimport.ImageImportPage"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "buildertools"
  - "imageimport"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.imageimport`

```java
public class ImageImportPage
```

Interactive custom UI page for importing images as block selections. Supports file browsing within asset pack directories, configurable max dimension (1-512), orientation (wall XY/XZ, floor), and origin point (bottom-left, bottom-center, center, top-center). Converts image pixels to closest block types via `BlockColorIndex` and places the result into the player's clipboard as a `BlockSelection`.
