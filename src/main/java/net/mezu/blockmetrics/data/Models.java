package net.mezu.blockmetrics.data;

import net.mezu.blockmetrics.Mod;

public final class Models {

	public static class Cake {
		public static final int defaultStars = 5;

		public String name;
		public double fluff;
		public int stars;

		public boolean isGood() {
			return this.stars > 5;
		}

		public CakeRating getCakeRating() {
			if (this.stars >= 7) {
				return CakeRating.GOOD;
			}

			if (this.stars >= 4) {
				return CakeRating.OKAY;
			}

			return CakeRating.BAD;
		}
	}

	public static enum CakeRating {
		GOOD, OKAY, BAD
	}

	// ----------------------------

	public static void demo() {
		var lemonCake = new Cake();

		lemonCake.name = "Lemon Cake";
		lemonCake.fluff = 0.6;
		lemonCake.stars = 7;

		lemonCake.getCakeRating();

		Mod.LOGGER.info("Done");
	}

}
