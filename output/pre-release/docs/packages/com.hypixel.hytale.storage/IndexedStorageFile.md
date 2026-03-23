---
title: "IndexedStorageFile"
kind: "class"
package: "com.hypixel.hytale.storage"
fqcn: "com.hypixel.hytale.storage.IndexedStorageFile"
api_surface: false
extends: null
implements:
  - "java.io.Closeable"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:30:09Z"
tags:
  - "server"
  - "storage"
  - "class"
---

**Package:** `com.hypixel.hytale.storage`

```java
public class IndexedStorageFile implements Closeable
```

Segment-based indexed binary storage file with Zstd compression. Supports reading, writing, and removing blobs by index. Uses memory-mapped blob indexes, stamped locks for concurrent access, and a `BitSet` for tracking used segments. Handles V0-to-V1 migration automatically.
