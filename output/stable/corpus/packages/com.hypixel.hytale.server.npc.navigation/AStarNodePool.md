# AStarNodePool

Type: interface | Package: com.hypixel.hytale.server.npc.navigation

public interface AStarNodePool

Object pool interface for A* nodes. Provides `allocate()` and `deallocate(AStarNode)` to reduce garbage collection pressure during pathfinding.
