/**
 * Copyright (C) 2011
 *   Michael Mosmann <michael@mosmann.de>
 *   Martin Jöhren <m.joehren@googlemail.com>
 *
 * with contributions from
 * 	konstantin-ba@github,
	Archimedes Trajano (trajano@github),
	Kevin D. Keck (kdkeck@github),
	Ben McCann (benmccann@github)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.flapdoodle.embed.process.io.progress;

import java.util.Optional;

import de.flapdoodle.embed.process.types.Percent;

/**
 * Progress listener interface
 */
public interface ProgressListener {

	void progress(String label, Percent percent);

	void done(String label);

	void start(String label);

	void info(String label, String message);
	
	interface ProgressEvent {
		Optional<String> message();
	}
	
	interface ProgessChanged extends ProgressEvent {
		Percent percent();
		
		
	}
	
	interface Starting extends ProgressEvent {
		
	}
	
	interface Done extends ProgressEvent {
		
	}
	
	interface Info extends ProgressEvent {
		
	}
}