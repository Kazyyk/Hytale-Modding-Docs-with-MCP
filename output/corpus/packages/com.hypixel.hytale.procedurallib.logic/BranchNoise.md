# BranchNoise

Type: class | Package: com.hypixel.hytale.procedurallib.logic | Implements: com.hypixel.hytale.procedurallib.NoiseFunction

public class BranchNoise implements NoiseFunction

Branching cell noise that combines a parent Voronoi cell pattern with line segments connecting parent cell centers to child cells. Evaluates parent cell distance, applies a density condition, then blends the parent value with a line-distance value using a configurable fade range. Only supports 2D evaluation; the 3D overload throws `UnsupportedOperationException`.

## Fields

- protected final CellDistanceFunction parentFunction
- protected final PointEvaluator parentEvaluator
- protected final double parentValue
- protected final double emptyValue
- protected final IDoubleRange parentFade
- protected final IIntCondition parentDensity
- protected final DistanceNoise.Distance2Function distance2Function
- protected final NoiseFormulaProperty.NoiseFormula.Formula noiseFormula
- protected final CellDistanceFunction lineFunction
- protected final PointEvaluator lineEvaluator
- protected final double lineScale
- protected final IDoubleRange lineThickness

## Constructor


public BranchNoise(
    CellDistanceFunction parentFunction,
    PointEvaluator parentEvaluator,
    double parentValue,
    IDoubleRange parentFade,
    IIntCondition parentDensity,
    DistanceNoise.Distance2Function distance2Function,
    NoiseFormulaProperty.NoiseFormula.Formula noiseFormula,
    CellDistanceFunction lineFunction,
    PointEvaluator lineEvaluator,
    double lineScale,
    IDoubleRange lineThickness
)

## Methods

- public double get(int seed, int offsetSeed, double x, double y)
- public double get(int seed, int offsetSeed, double x, double y, double z)
- @Nonnull protected ResultBuffer.ResultBuffer2d localBuffer2d()
- @Nonnull protected ResultBuffer.ResultBuffer2d getParentNoise(int seed, double x, double y)
- protected double getLineValue(int seed, double x, double y, int parentHash, double parentX, double parentY, double parentDistance, @Nonnull ResultBuffer.ResultBuffer2d buffer)
- protected static double toOutputRange(double value)
