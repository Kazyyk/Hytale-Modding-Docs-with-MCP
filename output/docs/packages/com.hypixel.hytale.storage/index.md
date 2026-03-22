---
title: "com.hypixel.hytale.storage"
kind: "package"
package: "com.hypixel.hytale.storage"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "storage"
  - "io"
  - "persistence"
---

**Package:** `com.hypixel.hytale.storage`

Low-level file-backed indexed storage using Zstd compression and memory-mapped I/O. Used for persisting world data (chunks, etc.) to disk with crash-safe write semantics.

## Types

| Type | Kind | Description |
|---|---|---|
| [IndexedStorageFile](IndexedStorageFile.md) | class | Current (v1) indexed storage file with segment-based allocation and Zstd compression. |
| [IndexedStorageFile_v0](IndexedStorageFile_v0.md) | class | Deprecated v0 format with linked-list segment chains. Automatically migrated on open. |
