---
title: "RadialScanner"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.scanners"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.scanners.RadialScanner"
api_surface: false
extends: "Scanner"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:59Z"
tags:
  - "worldgen"
  - "scanner"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.scanners`

```java
public class RadialScanner extends Scanner
```

A scanner that searches positions in a 3D bounds sorted by distance from origin, delegating to a child scanner at each position.
