# FastNoiseLite

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.noise

public class FastNoiseLite

Comprehensive noise generation library supporting multiple noise algorithms (OpenSimplex2, Perlin, Cellular, Value, ValueCubic), fractal layering (FBm, Ridged, PingPong), and domain warping. This is Hytale's adaptation of the open-source FastNoiseLite library.

## Inner Types

- FastNoiseLite.CellularDistanceFunction | enum
- FastNoiseLite.CellularReturnType | enum
- FastNoiseLite.DomainWarpType | enum
- FastNoiseLite.FractalType | enum
- FastNoiseLite.NoiseType | enum
- FastNoiseLite.RotationType3D | enum
- FastNoiseLite.TransformType3D | enum
- FastNoiseLite.Vector2 | class
- FastNoiseLite.Vector3 | class

## Fields

- private int mSeed
- private float mFrequency
- private FastNoiseLite.NoiseType mNoiseType
- private FastNoiseLite.RotationType3D mRotationType3D
- @Nonnull private FastNoiseLite.TransformType3D mTransformType3D
- private FastNoiseLite.FractalType mFractalType
- private int mOctaves
- private float mLacunarity
- private float mGain
- private float mWeightedStrength
- private float mPingPongStrength
- private float mFractalBounding
- private FastNoiseLite.CellularDistanceFunction mCellularDistanceFunction
- private FastNoiseLite.CellularReturnType mCellularReturnType
- private float mCellularJitterModifier
- private FastNoiseLite.DomainWarpType mDomainWarpType
- @Nonnull private FastNoiseLite.TransformType3D mWarpTransformType3D
- private float mDomainWarpAmp
- private float mDomainWarpFreq

## Constructors

- FastNoiseLite()
- FastNoiseLite(int seed)

## Methods

- public void setSeed(int seed)
- public void setFrequency(float frequency)
- public void setNoiseType(FastNoiseLite.NoiseType noiseType)
- public void SetRotationType3D(FastNoiseLite.RotationType3D rotationType3D)
- public void setFractalType(FastNoiseLite.FractalType fractalType)
- public void setFractalOctaves(int octaves)
- public void SetFractalLacunarity(float lacunarity)
- public void SetFractalGain(float gain)
- public void SetFractalWeightedStrength(float weightedStrength)
- public void SetFractalPingPongStrength(float pingPongStrength)
- public void setCellularDistanceFunction(FastNoiseLite.CellularDistanceFunction cellularDistanceFunction)
- public void setCellularReturnType(FastNoiseLite.CellularReturnType cellularReturnType)
- public void setCellularJitter(float cellularJitter)
- public void setDomainWarpType(FastNoiseLite.DomainWarpType domainWarpType)
- public void setDomainWarpAmp(float domainWarpAmp)
- public void setDomainWarpFreq(float domainWarpFreq)
- public float getNoise(double x, double y)
- public float getNoise(double x, double y, double z)
- public void DomainWarp(@Nonnull FastNoiseLite.Vector2 coord)
- public void DomainWarp(@Nonnull FastNoiseLite.Vector3 coord)
- public static int fastRound(double f)
- public Vector3d pointFor(int seed, double jitter, double x, double y, double z)
- @Nonnull public Vector2d pointFor(int seed, double jitter, double x, double y)
- public double pointFor(int seed, double jitter, double x)
- public float SingleCellular(int seed, double x, double y)
- public void DomainWarpSingle(@Nonnull FastNoiseLite.Vector3 coord)
- public void DomainWarpFractalProgressive(@Nonnull FastNoiseLite.Vector2 coord)
- public void DomainWarpFractalProgressive(@Nonnull FastNoiseLite.Vector3 coord)

Also in this package: Builder, CellNoiseField, CellularDistanceFunction, CellularReturnType, DomainWarpType, FractalType, Grad, NoiseField, NoiseType, RotationType3D, Simplex, SimplexNoiseField, TransformType3D, Vector2, Vector3

Complete API:
  public void setSeed(int seed)
  public void setFrequency(float frequency)
  public void setNoiseType(FastNoiseLite.NoiseType noiseType)
  public void SetRotationType3D(FastNoiseLite.RotationType3D rotationType3D)
  public void setFractalType(FastNoiseLite.FractalType fractalType)
  public void setFractalOctaves(int octaves)
  public void SetFractalLacunarity(float lacunarity)
  public void SetFractalGain(float gain)
  public void SetFractalWeightedStrength(float weightedStrength)
  public void SetFractalPingPongStrength(float pingPongStrength)
  public void setCellularDistanceFunction(FastNoiseLite.CellularDistanceFunction cellularDistanceFunction)
  public void setCellularReturnType(FastNoiseLite.CellularReturnType cellularReturnType)
  public void setCellularJitter(float cellularJitter)
  public void setDomainWarpType(FastNoiseLite.DomainWarpType domainWarpType)
  public void setDomainWarpAmp(float domainWarpAmp)
  public void setDomainWarpFreq(float domainWarpFreq)
  public float getNoise(double x, double y)
  public float getNoise(double x, double y, double z)
  public void DomainWarp(FastNoiseLite.Vector2 coord)
  public void DomainWarp(FastNoiseLite.Vector3 coord)
  private static float FastMin(float a, float b)
  private static float FastMax(float a, float b)
  private static float FastAbs(float f)
  private static float FastSqrt(float f)
  private static int FastFloor(double f)
  public static int fastRound(double f)
  private static float Lerp(float a, float b, float t)
  private static float InterpHermite(float t)
  private static float InterpQuintic(float t)
  private static float CubicLerp(float a, float b, float c, float d, float t)
  private static float PingPong(float t)
  private void CalculateFractalBounding()
  private static int hash(int seed, int xPrimed, int yPrimed)
  private static int hash(int seed, int xPrimed, int yPrimed, int zPrimed)
  private static float ValCoord(int seed, int xPrimed, int yPrimed)
  private static float ValCoord(int seed, int xPrimed, int yPrimed, int zPrimed)
  private static float GradCoord(int seed, int xPrimed, int yPrimed, float xd, float yd)
  private static float GradCoord(int seed, int xPrimed, int yPrimed, int zPrimed, float xd, float yd, float zd)
  private float GenNoiseSingle(int seed, double x, double y)
  private float GenNoiseSingle(int seed, double x, double y, double z)
  private void UpdateTransformType3D()
  private void UpdateWarpTransformType3D()
  private float GenFractalFBm(double x, double y)
  private float GenFractalFBm(double x, double y, double z)
  private float GenFractalRidged(double x, double y)
  private float GenFractalRidged(double x, double y, double z)
  private float GenFractalPingPong(double x, double y)
  private float GenFractalPingPong(double x, double y, double z)
  private float SingleSimplex(int seed, double x, double y)
  private float SingleOpenSimplex2(int seed, double x, double y, double z)
  private float SingleOpenSimplex2S(int seed, double x, double y)
  private float SingleOpenSimplex2S(int seed, double x, double y, double z)
  public Vector3d pointFor(int seed, double jitter, double x, double y, double z)
  public Vector2d pointFor(int seed, double jitter, double x, double y)
  public double pointFor(int seed, double jitter, double x)
  public float SingleCellular(int seed, double x, double y)
  private float SingleCellular(int seed, double x, double y, double z)
  private float SinglePerlin(int seed, double x, double y)
  private float SinglePerlin(int seed, double x, double y, double z)
  private float SingleValueCubic(int seed, double x, double y)
  private float SingleValueCubic(int seed, double x, double y, double z)
  private float SingleValue(int seed, double x, double y)
  private float SingleValue(int seed, double x, double y, double z)
  private void DoSingleDomainWarp(int seed, float amp, float freq, double x, double y, FastNoiseLite.Vector2 coord)
  private void DoSingleDomainWarp(int seed, float amp, float freq, double x, double y, double z, FastNoiseLite.Vector3 coord)
  private void DomainWarpSingle(FastNoiseLite.Vector2 coord)
  public void DomainWarpSingle(FastNoiseLite.Vector3 coord)
  public void DomainWarpFractalProgressive(FastNoiseLite.Vector2 coord)
  public void DomainWarpFractalProgressive(FastNoiseLite.Vector3 coord)
  private void DomainWarpFractalIndependent(FastNoiseLite.Vector2 coord)
  private void DomainWarpFractalIndependent(FastNoiseLite.Vector3 coord)
  private void SingleDomainWarpBasicGrid(int seed, float warpAmp, float frequency, double x, double y, FastNoiseLite.Vector2 coord)
  private void SingleDomainWarpBasicGrid(int seed, float warpAmp, float frequency, double x, double y, double z, FastNoiseLite.Vector3 coord)
  private void SingleDomainWarpSimplexGradient(int seed, float warpAmp, float frequency, double x, double y, FastNoiseLite.Vector2 coord, boolean outGradOnly)
  private void SingleDomainWarpOpenSimplex2Gradient(int seed, float warpAmp, float frequency, double x, double y, double z, FastNoiseLite.Vector3 coord, boolean outGradOnly)

Fields:
private int mSeed
private float mFrequency
private FastNoiseLite.NoiseType mNoiseType
private FastNoiseLite.RotationType3D mRotationType3D
private FastNoiseLite.TransformType3D mTransformType3D
private FastNoiseLite.FractalType mFractalType
private int mOctaves
private float mLacunarity
private float mGain
private float mWeightedStrength
private float mPingPongStrength
private float mFractalBounding
private FastNoiseLite.CellularDistanceFunction mCellularDistanceFunction
private FastNoiseLite.CellularReturnType mCellularReturnType
private float mCellularJitterModifier
private FastNoiseLite.DomainWarpType mDomainWarpType
private FastNoiseLite.TransformType3D mWarpTransformType3D
private float mDomainWarpAmp
private float mDomainWarpFreq
private static final float[] Gradients2D
private static final float[] RandVecs2D
private static final float[] Gradients3D
private static final float[] randVecs3D
private static final int primeX
private static final int primeY
private static final int primeZ
