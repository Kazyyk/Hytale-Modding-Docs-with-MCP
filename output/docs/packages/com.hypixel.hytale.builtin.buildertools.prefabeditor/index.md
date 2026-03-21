---
title: "com.hypixel.hytale.builtin.buildertools.prefabeditor"
---

## Package `com.hypixel.hytale.builtin.buildertools.prefabeditor`

Core prefab editor infrastructure. Manages edit sessions, prefab metadata, anchor entities, interaction handlers, dirty tracking, loading progress, and configuration persistence.

| Type | Kind | Description |
|---|---|---|
| [PrefabAnchor](PrefabAnchor.md) | class | ECS marker component for anchor entities. |
| [PrefabDirtySystems](PrefabDirtySystems.md) | class | ECS event systems for dirty-tracking block changes. |
| [PrefabEditingMetadata](PrefabEditingMetadata.md) | class | Per-prefab bounding box, anchor, path, and dirty state. |
| [PrefabEditorCreationContext](PrefabEditorCreationContext.md) | interface | Parameters for creating an edit session. |
| [PrefabEditorCreationSettings](PrefabEditorCreationSettings.md) | class | Serializable settings implementing creation context. |
| [PrefabEditSession](PrefabEditSession.md) | class | Active session tracking loaded prefabs and selections. |
| [PrefabEditSessionManager](PrefabEditSessionManager.md) | class | Lifecycle manager for all edit sessions. |
| [PrefabLoadingState](PrefabLoadingState.md) | class | Multi-phase loading progress tracker. |
| [PrefabMarkerProvider](PrefabMarkerProvider.md) | class | World map marker provider for loaded prefabs. |
| [PrefabSelectionInteraction](PrefabSelectionInteraction.md) | class | Ray-trace and nearest-prefab selection interaction. |
| [PrefabSetAnchorInteraction](PrefabSetAnchorInteraction.md) | class | Anchor placement interaction handler. |
| [Tri](Tri.md) | class | Generic immutable 3-tuple. |
