---
title: "ChunkSectionReference"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.chunk.section"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.section.ChunkSectionReference"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "chunk"
  - "section"
  - "reference"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.chunk.section`

```java
public class ChunkSectionReference
```

A simple holder binding a `BlockChunk`, `BlockSection`, and section index together. Used as a convenience type for passing section context between methods that need access to both the parent chunk and a specific section.

## Constructors

```java
public ChunkSectionReference(BlockChunk chunk, BlockSection section, int sectionIndex)
```

## Instance Methods

```java
public BlockChunk getChunk()
```

```java
public BlockSection getSection()
```

```java
public int getSectionIndex()
```
