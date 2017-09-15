/**
* (C) Copyright IBM Corporation 2017.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package io.swagger.sample.jaxrs.model;

public class TaskWithID extends Task {
    private int id;

    public TaskWithID(Task task, int id) {
        this.id = id;
        this.setDeadline(task.getDeadline());
        this.setDescription(task.getDescription());
        this.setStatus(task.getStatus());
    }

    public int getId() {
        return this.id;
    }
}