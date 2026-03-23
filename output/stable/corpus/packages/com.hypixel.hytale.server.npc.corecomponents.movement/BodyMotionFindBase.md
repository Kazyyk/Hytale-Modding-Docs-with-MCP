# BodyMotionFindBase

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement | Extends: BodyMotionBase | Implements: A, S, t, a, r, E, v, a, l, u, a, t, o, r

public abstract class BodyMotionFindBase<T extends AStarBase> extends BodyMotionBase implements AStarEvaluator

Abstract base class for pathfinding motions with A* integration. Manages the pathfinding lifecycle: path computation, path following, throttling, and debug visualization. Subclasses provide goal-reached and goal-evaluation logic.

## Key Fields

- nodesPerTick | int | Maximum A* nodes expanded per tick
- useBestPath | boolean | Whether to use the best partial path if goal is unreachable
- throttleDelayMin | double | Minimum delay between path recomputations
